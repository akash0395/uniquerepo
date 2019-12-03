package com.service;
import java.util.Scanner;

public class StringArrayService {
	public static void acceptStringArray(String[] arr) {
		 Scanner sc=new Scanner(System.in);
		 for(int i=0;i<arr.length;i++) {
			 System.out.println("Enter arr : "+i+"--->");
			 arr[i]=sc.next();
		}
	}

	public static void displayStringArray(String[] names) {
		for(int i=0;i<names.length;i++) {
			 System.out.println("Enter arr : "+i+"--->"+names[i]);
			
		}
		  
	}
	
	public static int searchName(String[] names,String nm) {
		for(int i=0;i<names.length;i++) {
			if(names[i].equals(nm)) {
				return i;
			}
		}
		return -1;
		
	}
	
	public static int modifyName(String[] names,String on,String nn) {
		int pos=searchName(names,on);
		if(pos!=-1) {
			names[pos]=nn;
			
		}
		return pos;
			
		
	}
	
	

}
