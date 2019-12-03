package com.test;

import java.io.IOException;
import java.util.Scanner;

import com.model.Employee;
import com.service.ServiceClass;

public class TestClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ServiceClass serviceClass=new ServiceClass();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Create File\n 2. Write File\n 3.Read File \n 4.exit");
		System.out.println("Enter File name");
		String fname=sc.next();
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
	
		switch (ch) {
		case 1: serviceClass.createFile(fname);
			
			break;
		case 2: 
			Employee emp=new Employee(101,"dddd",5000);
		
			serviceClass.writeFile(fname,emp);
		
		break;
case 3: serviceClass.readFile(fname);
		
		break;
		default:
			break;
		}
		
		
		
		
	}

}
