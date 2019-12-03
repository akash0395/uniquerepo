package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class myMapTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
	
		
		HashMap<String,Treename> mt= new HashMap<>();
		
		
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
		System.out.println(mt);
		
		
		
		System.out.println("enter search city ");
		String city=sc.next();
		System.out.println("contaons key"+mt.containsKey(city));
		
		
		
		
	}
	
}
