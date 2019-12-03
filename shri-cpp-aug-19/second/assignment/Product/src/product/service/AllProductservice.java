package product.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import product.model.Nonperishable;
import product.model.Perishable;
import product.model.Product;

public class AllProductservice {

	public static void StartMain() 
	{
		ProductInter pf = null;
		System.out.println("Product:-");
		System.out.println("+++++++++++  Main Start  ++++++++");
		List<Product> Prod=new ArrayList<>();
		do {
			System.out.println("1.Add Product");
			System.out.println("2.Serach Product by id ");
			System.out.println("3.Serach Product by name ");
			System.out.println("4.Display Product");
			System.out.println("5.Exit");
			System.out.println("Enter the Choice");
			Scanner sc=new Scanner(System.in);
			int c=sc.nextInt();
			switch (c) {
			case 1:
				System.out.println("1)Perishable 2)nonperishable");
				int i=sc.nextInt();
				if(i==1)
				{
				pf= new PerishableService();
				}
				else
				{
				pf=new NonPerishableService();
				}
				Prod.add(pf.acceptData());
				break;
				
			case 2:
				System.out.println("1)perishable 2)nonperishable");
				int id=sc.nextInt();
				if(id==1)
				{
				pf= new PerishableService();
				}else
				{
				pf=new NonPerishableService();
				}
				System.out.println("enter product id");
				int sid=sc.nextInt();
				Product ids=pf.searchById(Prod,sid);
				System.out.println(ids);
				break;
				
			case 3:
				System.out.println("1)perishable 2)nonperishable");
				int nm=sc.nextInt();
				if(nm==1)
				{
				pf= new PerishableService();
				}else
				{
				pf=new NonPerishableService();
				}
				System.out.println("enter product name");
				String snm=sc.next();
				Product nms=pf.searchByName(Prod,snm);
				System.out.println(nms);
				break;
				
			case 4:
				System.out.println("1)Perishable 2)nonperishable");
				int i1=sc.nextInt();
				if(i1==1)
				{
				pf= new PerishableService();
				}else
				{
				pf=new NonPerishableService();
				}
				for (Product product : Prod) {
				
					System.out.println(product);
				}
				
				break;
			case 5:System.exit(0);
				break;
			}
		}while(true);
	}
}
