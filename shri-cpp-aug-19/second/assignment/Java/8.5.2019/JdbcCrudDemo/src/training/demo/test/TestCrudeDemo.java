package training.demo.test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import training.demo.dao.ProductDao;
import training.demo.model.Product;
import training.demo.service.ProductService;

public class TestCrudeDemo {
	public static void main(String[] args) {
		ProductDao dao=new ProductDao();
		int ch=0;
		ProductService service=new ProductService(dao);
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1. Add new product");
		System.out.println("2. Delete Product");
		System.out.println("3. Update Product");
		System.out.println("4. Display All");
		System.out.println("5. Display by id");
		System.out.println("6. Exit");
	    ch=sc.nextInt();
		switch(ch) {
		case 1:
			Product p=service.createProduct();
			int n=service.inserProduct(p);
			if(n>0) {
				System.out.println("Record Inserted....");
			}
			else {
				System.out.println("Record not Inserted....");
			}
			break;
		case 2:
			System.out.println("enter id for deleting");
			int id=sc.nextInt();
			 try {
				p=service.getById(id);
			
			 if(p!=null) {
			 System.out.println(p);
			 System.out.println("delete (y/n)?");
			 String ans=sc.next();
			 if(ans.equals("y"))
			 {
				 n= service.deleteProduct(p);
				 if(n>0) {
					 System.out.println("Record deleted.....");
				 }
				 else {
					 System.out.println("some error");
				 }
			 }
			 }else {
				 System.out.println("product notFound");
			 }} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			break;
		case 3:
			System.out.println("Enter id for update");
			id=sc.nextInt();
			try {
				Product p1=service.getById(id);
				System.out.println(p1);
				System.out.println("Enter new data");
				String nm=sc.next();
				String desc=sc.next();
				p=new Product(id,nm,desc);
				n=service.updateProduct(p);
				if(n>0)
				{
					System.out.println("Product updated");
				}
				else
				{
					System.out.println("Some error..");
				}
			} catch (SQLException e1) {
			
				e1.printStackTrace();
			}
			break;
		case 4:
			try {
				ArrayList<Product>plist=service.displayAll();
				plist.forEach((p1)->{System.out.println(p1);});
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case 5:
			System.out.println("Enter id to display");
			id=sc.nextInt();
			
			try {
				p=service.getById(id);
				System.out.println(p);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		case 6:
			System.exit(0);
			break;
		}}while(ch!=6);
		
	}

}
