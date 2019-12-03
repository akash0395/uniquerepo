package training.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import training.demo.model.Employee;

public class EmployeeService {
	public static void acceptData(List<Employee> elst) {
		Scanner sc=new Scanner(System.in);
		String ans=null;
		do {
		System.out.println("enter Id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String nm=sc.next();
		System.out.println("enter sal");
		double s=sc.nextDouble();
		Employee e=new Employee(id,nm,s);
		elst.add(e);
		System.out.println("Do you want to continue?(y/n)");
		ans=sc.next();
		}while(ans.equals("y"));
		
		
	}

	public static int searchData(List<Employee> elist,int id, String nm) {
	
		Employee e=new Employee(id,nm);
		System.out.println("Searching.....");
		int pos=elist.indexOf(e);
		return pos;
		
	}

	public static boolean searchAll(ArrayList<Employee> elist, List<Employee> lst) {
		return elist.containsAll(lst);
	}
	public static boolean removeByPosition(ArrayList<Employee> elist, int id,String nm) {
		Employee e=new Employee(id,nm);
		int pos=elist.indexOf(e);
		 Employee e1=elist.remove(pos);
		 if(e1!=null) {
			 return true;
		 }
		 else 
			 return false;
	}
}
