package training.demo.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import training.demo.model.Emp;
import training.demo.service.EmpService;

public class SeriliazationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {


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
			EmpService.writeData(fn);
			break;
		case 2:
			ArrayList<Emp> al=EmpService.readData(fn);
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
