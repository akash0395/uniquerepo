package Account.Test;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

import Account.Model.Account;
import Account.Service.ServiceFunctions;
import Account.dao.AccountDao;



public class AccountTest {

	public static void main(String[] args) throws ParseException {
		
		AccountDao dao=new AccountDao();
		ServiceFunctions service=new ServiceFunctions(dao);
		
		
		
		//Account[] ob=new Account[2];
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("***********Menu**********");
			System.out.println("1.Create Account");
			System.out.println("2.Withdraw Amount ");
			System.out.println("3.Deposite Amount");
			System.out.println("4.Check Balance");
			System.out.println("5.Fund Transfer ");
			System.out.println("6.Display ");
			System.out.println("7.Exit");
			System.out.println("Enter your choice"); 
			
			 ch=sc.nextInt();
	        switch(ch)
	        {
	        case 1:
	        	Account a=ServiceFunctions.create();
	        	int n=ServiceFunctions.insertProduct(a);
	        	if(n>0) {
	        		System.out.println("Data inseted");
	        	}
	        	else {
	        		System.out.println("Data unable to insert");
	        	}
	        	System.out.println();
	        	break;
	        case 2:
	        	System.out.println("Enter Account Id : ");
	        	int ac=sc.nextInt();
				try {
					ServiceFunctions.withdraw(ac);
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        	break;
	        case 3:
	        	System.out.println("Enter Account Id : ");
	        	int ac1=sc.nextInt();
	        	try {
					//av = (Resultset) ServiceFunctions.getByid(ac);
	        		ServiceFunctions.deposite(ac1);
				} catch (SQLException e) {
					e.printStackTrace();
				}
	        	break;
	        case 4:
	        	System.out.println("Enter Account Id : ");
	        	int ac2=sc.nextInt();
	        	try {
					ServiceFunctions.CheckBalance(ac2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	break;
	        case 5:
	        	System.out.println("Enter Account Id : ");
	        	int ac3=sc.nextInt();
	        	System.out.println("Enter Dest account id : ");
	        	int ac4=sc.nextInt();
	        	
	        	try {
					ServiceFunctions.fundTransfer(ac3,ac4);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        	break;
	        case 6:
	        	ArrayList<Account> al=ServiceFunctions.display();
	        	al.forEach((p)->{System.out.println(p);});
	        break;
	        case 7:
	        	System.exit(0);
	        	break;
	        default:
	        	break;
	        }
	       

		}while(ch!=6);
	}
}
