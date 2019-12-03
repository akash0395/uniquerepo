package sportclub.test;

import java.util.Scanner;

import sportclub.model.SalariedEmp;
import sportclub.service.EmployeeService;

public class TestSalaried {
	public static void main(String[] args) {
		//SalariedEmp ob=new SalariedEmp(11, "Rajan", "hagsh@sh.com", "game", "CTO", 234.98f, 347.00f);
		//System.out.println(ob);
		
		SalariedEmp[] emparr=new SalariedEmp[2];
		EmployeeService.acceptdatasal(emparr);
		
		EmployeeService.displayDatasal(emparr);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter id to searched");
		int id=sc.nextInt();
		int pos=EmployeeService.searchByIdsal(emparr, id);
		if(pos!=-1)
		{
			System.out.println(emparr[pos]);
		}
	}
}
