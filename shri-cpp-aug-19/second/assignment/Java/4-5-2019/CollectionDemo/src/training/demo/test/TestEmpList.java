package training.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import training.demo.model.Employee;
import training.demo.service.EmployeeService;

public class TestEmpList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> elist=new ArrayList<>();
		int ch;
		do {
		System.out.println("1. Accept new employee");
		System.out.println("2. Search employee");
		System.out.println("3. search many Employees");
		System.out.println("4. Remove employee by position");
		System.out.println("5. Remove employee by name and id");
		System.out.println("6. exit");
		System.out.println("choice");
		 ch=sc.nextInt();
		switch(ch) {
		
		case 1:
			EmployeeService.acceptData(elist);
			break;
		case 2:
			System.out.println("enter Id");
			int id=sc.nextInt();
			System.out.println("enter name");
			String nm=sc.next();
			int pos=EmployeeService.searchData(elist,id,nm);
			if(pos!=-1) {
				System.out.println("found");
				System.out.println(elist.get(pos));
			}
			else {
				
				System.out.println("not found");
			}
			break;
		case 3: 
			List<Employee> lst= new ArrayList<>();
			EmployeeService.acceptData(lst);
			boolean check=EmployeeService.searchAll(elist,lst);
			if(check==true) {
				System.out.println("found all");
			}
			else
			{
				System.out.println("not found all");
			}
		case 4:
			System.out.println("enter id");
			int id1=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			 check=EmployeeService.removeByPosition(elist,id1,name);
			if(check) {
				System.out.println("employee removed");
			}
			else {
				System.out.println("not found for removal");
			}
			
			
		}
		
		}while(ch!=6);
		
		System.out.println(elist);
		
		
		
		
		
		
		

	}

}
