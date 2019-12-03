package sportclub.service;

import java.util.Scanner;

import sportclub.model.ItemInfo;
import sportclub.model.Person;
import sportclub.model.SupplierInfo;

public class SupplierService {

	
	public static void acceptSupplier(SupplierInfo[] suparr)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<suparr.length;i++)
		{
			System.out.println("enter id name email address item climit");
			suparr[i]=new SupplierInfo();
			Person.acceptdata(suparr[i]);
			SupplierInfo.acceptdata(suparr[i]);
		}
	}
	
	public static void displaySupplier(SupplierInfo[] suparr)
	{
		for(SupplierInfo ob1:suparr)
		{
			System.out.println(ob1);
		}
	}

	public static void acceptitem(ItemInfo items) {
		items.setIname("sds");
		items.setIno(12);
	}
}
