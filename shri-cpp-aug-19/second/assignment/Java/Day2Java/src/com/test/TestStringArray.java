package com.test;
import java.util.Scanner;
import com.service.*;

public class TestStringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names=new String[5];
		int ch;
		do {
		System.out.println("1.Accept data");
		System.out.println("2.Search name");
		System.out.println("3. modify name");
		System.out.println("4. Display name");
		System.out.println("5.exit");
		System.out.println("choice: ");
		ch=sc.nextInt();
		switch(ch) {
		case 1:
			StringArrayService.acceptStringArray(names);
			break;
		case 2:
			System.out.println("Enter name");
			String nm=sc.next();
			int pos=StringArrayService.searchName(names,nm);
			if(pos!=-1) {
				System.out.println("name found");
			}else {
				
				System.out.println("name not found");
			}
			break;
		case 3:
			System.out.println("enter old name");
			String on=sc.next();
			System.out.println("enter new name");
			String nn=sc.next();
			 pos=StringArrayService.modifyName(names,on,nn);
			if(pos!=-1) {
				System.out.println("Modification done");
			}
			else {
				System.out.println("Modification not done");
				
			}
			break;
		case 4:
			StringArrayService.displayStringArray(names);
			break;
		default:
			System.exit(0);
		}
		}while(ch!=5);
		

	}

}
