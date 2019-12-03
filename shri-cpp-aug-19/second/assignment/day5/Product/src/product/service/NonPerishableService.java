package product.service;

import java.util.List;
import java.util.Scanner;

import product.model.Nonperishable;
import product.model.Product;

public class NonPerishableService implements ProductInter {

	@Override
	public Product acceptData() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter pid,pname,qty,rate,desc,wper");
		int pid=sc.nextInt();
		String pname=sc.next();
		int qty=sc.nextInt();
		double rate=sc.nextInt();
		String desc=sc.next();
		int wper=sc.nextInt();
		Nonperishable p1=new Nonperishable(pid,pname,qty,rate,desc,wper);
		return p1;
	}
	
	@Override
	public void displayProduct(Product p) {
		// TODO Auto-generated method stub
		System.out.println(p);
	}

	@Override
	public Product searchById(List<Product> Prod, int id) {
		System.out.println("In searchById method");
		
		for(int i=0;i<Prod.size();i++)
		{
			if(Prod.get(i).getPid()==id)
			{
			//System.out.println("same........"+peri.get(i));
				return Prod.get(i);
			}
		}
		return null;
	}

	@Override
	public Product searchByName(List<Product> Prod, String name) {
		System.out.println("In searchByName method");
		
		for(int i=0;i<Prod.size();i++)
		{
			if(Prod.get(i).getpname().equals(name))
			{
			//System.out.println("same........"+peri.get(i));
				return Prod.get(i);
			}
		}
		return null;
	}
}
