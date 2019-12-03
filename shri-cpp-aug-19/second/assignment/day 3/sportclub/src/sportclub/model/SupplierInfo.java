package sportclub.model;

import java.util.Scanner;

import sportclub.service.SupplierService;
import sportclub.model.*;;
public class SupplierInfo extends Person{
	ItemInfo items;
	String address;
	int climit;
	
	public static void acceptdata(SupplierInfo arr)
	{
		Scanner s=new Scanner(System.in);
		
		ItemInfo[] items= new ItemInfo[2];
		//SupplierService.acceptitem(items);
		String address=s.next();
		int climit=s.nextInt();
		arr.setAddS(address);
		arr.setClimit(climit);
		//arr.setItems(items);
	}
	
	public ItemInfo getItems() {
		return items;
	}

	public void setItems(ItemInfo items) {
		this.items = items;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public SupplierInfo()
	{
		address=null;
		climit=0;
	}
	
	public SupplierInfo(int id,String name,String email,String add,ItemInfo items,int climit)
	{
		super(id,name,email);
		address=add;
		this.climit=climit;
		this.items=items;
	}
	
	public void setAddS(String ad)
	{
		this.address=ad;
	}
	
	public String getAddS()
	{
		return address;
	}
	
	public void setClimit(int c)
	{
		this.climit=c;
	}
	
	public int getClimit()
	{
		return climit;
	}
	
	public String toString()
	{
		return super.toString()+"\naddress="+address+"items"+items+"\ncreditlimit="+climit;
	}
}
