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
		
		
		int ch;
		do {
		System.out.println("1. Add new city");
		System.out.println("2. Delete city and treelist");
		System.out.println("3. delete tree from given tree");
		System.out.println("4. list city contains user given tree name");
		
		System.out.println("5. Add tree in existing cities tree list");

		System.out.println("6. Display all city and treelist");
		
		System.out.println("7. exit");
		System.out.println("choice");
		 ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			
			TreeService.acceptdata(mt);
			break;
		case 2:
			TreeService.deletecity(mt);
			break;
		case 3:
			TreeService.deleteTree(mt);
			break;
		case 4:

			TreeService.Search(mt);
			break;
		case 5:
			TreeService.addtreeInExisting(mt);
			 break;
		case 6:
			TreeService.displaydata(mt);
			break;
		case 7:
			System.exit(0);
			break;
			
		}
		}while(ch!=7);
		
		

		
		
	/*	Set<String>ky = mt.keySet();
		for(String key:ky) {
			Treename t=mt.get(key);
			ArrayList<String> list=t.getAl();
			for(String tname:list) {
				//if(mt.get(key).equals(tname1))
				System.out.println(key+" : "+tname);
			}
		}
		*/
		
		
		
		/*System.out.println("enter value for search");
		String tname=sc.next();
		Iterator <Treename> it=mt.iterator();
		System.out.println("contaons key"+mt.containsValue(tname));*/
		
		
		
		
		
		
		
		
		
	}
	
		}
