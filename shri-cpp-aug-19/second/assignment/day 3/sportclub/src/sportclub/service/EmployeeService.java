package sportclub.service;

import java.util.Scanner;

import sportclub.model.ContractEMP;
import sportclub.model.Employee;
import sportclub.model.Person;
import sportclub.model.SalariedEmp;

public class EmployeeService {
	
	public static void acceptdatasal(SalariedEmp[] sarr) {
		
		Scanner s=new Scanner(System.in);
		for(int i=0;i<sarr.length;i++) {
			System.out.println("enter id name email dept desig sal bonus");
			sarr[i]= new SalariedEmp();
			Person.acceptdata(sarr[i]);
			Employee.acceptdata(sarr[i]);
			SalariedEmp.acceptdata(sarr[i]);
		}
	}
       public static void displayDatasal(SalariedEmp[] sarr) {
    	   
    	   for (SalariedEmp ob:sarr) {
    		   System.out.println(ob);
    	   }
       }    
       
       public static int searchByIdsal(SalariedEmp[] emparr,int id) {
    	   for(int i=0;i<emparr.length;i++) {
    		   if(id==emparr[i].getId())
    			   return i;
    	   }
    	   return-1;
       }
       
       
       public static void acceptdatacon(ContractEMP[] carr) {
   		
   		Scanner s=new Scanner(System.in);
   		for(int i=0;i<carr.length;i++) {
   			System.out.println("enter id name email dept desig dailycharge workdays");
   			carr[i]= new ContractEMP();
   			Person.acceptdata(carr[i]);
   			Employee.acceptdata(carr[i]);
   			ContractEMP.acceptdata(carr[i]);
   		}
   	}
          public static void displayDatacon(ContractEMP[] carr) {
       	   
       	   for (ContractEMP ob1:carr) {
       		   System.out.println(ob1);
       	   }
          }    
          
          public static int searchByIdcon(ContractEMP[] conarr,int id) {
       	   for(int i=0;i<conarr.length;i++) {
       		   if(id==conarr[i].getId())
       			   return i;
       	   }
       	   return-1;
          }
}
