package training.demo.test;

import java.util.Scanner;

import training.demo.model.SalariedEmp;
import training.demo.service.EmployeeService;

public class TestSalaried {

	public static void main(String[] args) {
		//SalariedEmp ob=new SalariedEmp(1111, "Rajan", "hagsh@sh.com", "game", "CTO", 23456.98f, 34567.00f);
		//System.out.println(ob);
        SalariedEmp[] emparr=new SalariedEmp[2];
        EmployeeService.acceptData(emparr);
        
        EmployeeService.displayData(emparr);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter is for search");
        int id=sc.nextInt();
        int pos=EmployeeService.searchById(emparr,id);
        if(pos!=-1) {
        	System.out.println(emparr[pos]);
        }
	}

}
