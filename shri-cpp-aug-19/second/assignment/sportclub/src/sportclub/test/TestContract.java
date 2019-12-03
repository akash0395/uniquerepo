package sportclub.test;

import java.util.Scanner;

import sportclub.model.ContractEMP;
import sportclub.model.SalariedEmp;
import sportclub.service.EmployeeService;

public class TestContract {

	public static void main(String[] args) {
		
		ContractEMP[] conarr=new ContractEMP[2];
		EmployeeService.acceptdatacon(conarr);
		
		EmployeeService.displayDatacon(conarr);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\nenter id to searched");
		int id=sc.nextInt();
		int pos=EmployeeService.searchByIdcon(conarr, id);
		if(pos!=-1)
		{
			System.out.println(conarr[pos]);
		}
	}
}
