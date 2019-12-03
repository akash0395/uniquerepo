package training.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import training.demo.dao.ProductDao;
import training.demo.model.Product;

public class ProductService {
	private ProductDao dao;
	
	public ProductService(ProductDao dao) {
		super();
		this.dao = dao;
	}

	public ArrayList<Product> displayAll() throws SQLException {
		ArrayList<Product> al=new ArrayList<>();
		ResultSet rs=dao.getProducts();
		while(rs.next()) {
			Product p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3));
			al.add(p);
		}
		return al;
		
		
	}

	public int inserProduct(Product p) {
		return dao.insertProductData(p);
		
	}

	public Product createProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		int id=sc.nextInt();
		String nm=sc.next();
		String desc=sc.next();
		return new Product(id,nm,desc);
	}

	public Product getById(int id) throws SQLException {
		ResultSet rs=dao.getProductById(id);
		if(rs.next()) {
			Product p=new Product(rs.getInt(1),rs.getString(2),rs.getString(3));
			return p;
		}
		return null;
	}

	public int deleteProduct(Product p) throws SQLException {
		return dao.deleteProduct(p);
		
	}

	public int updateProduct(Product p) throws SQLException {
		return dao.updateProduct(p);
	}

}
