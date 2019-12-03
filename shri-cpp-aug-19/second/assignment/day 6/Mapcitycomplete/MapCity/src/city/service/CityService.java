package city.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import city.model.Trees;

public class CityService {
	public static void addData(HashMap<String,Trees> hm)
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter the city name");
			String city=sc.next();
			Trees tr=new Trees();
			for(int j=0;j<2;j++)
			{
				System.out.println("Enter the tree names");
				tr.getName().add(sc.next());
			}
			 hm.put(city,tr);
		}
	}
	
	public static void dispaly(HashMap<String,Trees> hm)
	{
		//System.out.println(hm);
		Set<String> s=hm.keySet();
		
		for(String s1:s)
		{
			System.out.println("key"+s1+"-->"+"value"+hm.get(s1));
		}
	}
	
	public static void delete(HashMap<String,Trees> hm)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name of city to delete");
		String c=sc1.next();
		//Set<String> s=hm.keySet();
			if(hm.containsKey(c))
			{
				hm.remove(c);
			}
	}
	
	public static void deleteTree(HashMap<String,Trees> hm)
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter name of city");
		String c=sc1.next();
		System.out.println("Enter tree name to delete");
		String t=sc1.next();
		Trees t1=null;
		if(hm.containsKey(c))
		{
			t1=hm.get(c);
			ArrayList<String> t2=t1.getName();
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
	
	public static void addTree(HashMap<String,Trees> hm)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of city");
		String ci=sc.next();
		System.out.println("Enter tree name to add");
		String ts=sc.next();
		Set<String>s=hm.keySet();
		for(String s1:s)
		{
			if(s1.equals(ci))
			{
				Trees n=hm.get(s1);
				ArrayList<String> n1=n.getName();
				n1.add(ts);
			}
		}
	}
	
	public static void displayCity(HashMap<String,Trees> hm)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter tree name");
		String t1=sc.next();
		Set<String> s=hm.keySet();
		for(String s1:s)
		{
			Trees t=hm.get(s1);
			ArrayList<String> tr=t.getName();
			for(String tr1:tr)
			{
			if(tr1.equals(t1))
			{
				System.out.println("cities="+s1);
				break;
			}
			}
		}
	}
}
