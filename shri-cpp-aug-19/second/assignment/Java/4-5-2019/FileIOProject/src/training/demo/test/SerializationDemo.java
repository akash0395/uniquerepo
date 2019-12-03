package training.demo.test;

import java.util.ArrayList;
import java.util.Scanner;

import training.demo.model.Employee;
import training.demo.service.EmployeeService;

public class SerializationDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ans=null;
		String fn=null;
		do {
		System.out.println("1. Write data");
		System.out.println("2. Read Data");
		System.out.println("3. Exit");
		System.out.println("Choice: ");
		int ch=sc.nextInt();
			
		switch(ch) {
		case 1:
			System.out.println("enter file name");
			 fn=sc.next();
			EmployeeService.writeData(fn);
			break;
		case 2:
			ArrayList<Employee> al=EmployeeService.readData(fn);
			al.forEach((s)->{System.out.println(s);});
			break;
		case 3:
			System.exit(0);
		}
		System.out.println("do you want to continue(y/n)?");
		ans=sc.next();
		}while(ans.equals("y"));
	}

}
