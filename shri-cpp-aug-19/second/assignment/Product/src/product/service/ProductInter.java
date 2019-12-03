package product.service;

import java.util.List;

import product.model.Perishable;
import product.model.Product;

public interface ProductInter {
	public void displayProduct(Product p);
	public Product acceptData();
	public Product searchById(List<Product> Prod,int id);
	public Product searchByName(List<Product> Prod,String name);
	
}
