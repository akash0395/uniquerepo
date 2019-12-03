package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class TreeService {
	
	
	
	public static void acceptdata(HashMap<String,Treename> mt)
	{
		Scanner sc=new Scanner(System.in);
		 int j=0;
			do
			{
				System.out.println("entrt city name");
				String cit=sc.next();
				Treename t= new Treename();
				for(int i=0;i<3;i++)
				{
					System.out.println("Enter  Tree name");
			    	t.getAl().add(sc.next());
				}
			    mt.put(cit, t);
			    System.out.println("do you want add another city 1/0");
			j=sc.nextInt();
			}while(j==1);
			
	}
	
	public static void displaydata(HashMap<String,Treename> mt)
	{
		
		System.out.println(mt);
	}
	
	
	public static void deletecity(HashMap<String,Treename> mt)
	{
		Scanner sc=new Scanner(System.in);
	System.out.println("enter city for delete ");
	String city=sc.next();
	System.out.println("contaons key"+mt.containsKey(city));
	
	if(mt.containsKey(city))
	{
		mt.remove(city);
		System.out.println(mt);
	}
	
	}
	
	public static void Search(HashMap<String,Treename> mt)
	{
		Scanner sc=new Scanner(System.in);
	
	System.out.println("enter value for serach");
	String tname1=sc.next();
	//System.out.println("contaons key"+mt.containsValue(tname1));
	/*String t=sc.next();
	Treename t1=null;
			t1=mt.get(tname1);
		ArrayList<String> t2=t1.getAl();
		
		Iterator it=t2.iterator();
		
		if(it.hasNext())
		{
			if(equals(t2.get(tname1)))
		}
	
	for(String s1:t2)
	{
		
		if(mt.get(s1).equals(tname1))
		{
			System.out.println("key:"+s1+"----value"+mt.get(s1));
		}
	}
	*/
	
	///////////////////////////
	Set <String>s=mt.keySet();
	for(String s1:s) {
		
		Treename l=mt.get(s1);
		ArrayList<String> t3=l.getAl();
		
		for(String l1:t3) {
			if(l1.equals(tname1))
			{
				System.out.println("key:"+s1+"--- value:"+tname1);
				break;
			}
			
		}			
	}
	System.out.println("no such tree present");
	
	
	
	
	

	
	
	}
	
	public static void addtreeInExisting(HashMap<String,Treename> hm)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name of city for add tree");
		String c=sc1.next();
		System.out.println("Enter tree name to add");
		String t=sc1.next();
		Treename t1=null;
		if(hm.containsKey(c))
		{
			t1=hm.get(c);
			ArrayList<String> t2=t1.getAl();
			
			t2.add(t);
			
			/*Iterator<String> it=t2.iterator();
			
			while (it.hasNext()) {
				String t4=it.next();
				
				
				if(t4.equals(t))
				{
					it.remove();
					break;
				}
				
			}*/
		}	
		
		
	
	}
	
	
	
	public static void deleteTree(HashMap<String,Treename> hm)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name of city having tree want to delete");
		String c=sc1.next();
		System.out.println("Enter tree name to delete");
		String t=sc1.next();
		Treename t1=null;
		if(hm.containsKey(c))
		{
			t1=hm.get(c);
			ArrayList<String> t2=t1.getAl();
			Iterator<String> it=t2.iterator();
			while (it.hasNext()) {
				String t4=it.next();
				if(t4.equals(t))
				{
					it.remove();
					break;
				}
				
			}
		}	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
