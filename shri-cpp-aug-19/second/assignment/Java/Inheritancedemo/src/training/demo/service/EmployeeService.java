package training.demo.service;

import java.util.Scanner;

import training.demo.model.SalariedEmp;

public class EmployeeService {
	
	public static void acceptData(SalariedEmp[] sarr) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sarr.length;i++) {
			System.out.println("Enter data");
			int id=sc.nextInt();
			String nm=sc.next();
			String em=sc.next();
			String dt=sc.next();
			String ds=sc.next();
			float sal=sc.nextFloat();
			float bonus=sc.nextFloat();
			sarr[i]=new SalariedEmp(id,nm,em,dt,ds,sal,bonus);
		}
	}
	
	public static void displayData(SalariedEmp[] sarr) {
		for(SalariedEmp ob:sarr) {
			System.out.println(ob);
			
		}
		
	}

	public static int searchById(SalariedEmp[] emparr, int id) {
		for(int i=0;i<emparr.length;i++) {
			if(id==emparr[i].getId())
		            return i;
	}
	return-1;
	}

}
