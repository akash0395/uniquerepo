package Account.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.mysql.cj.protocol.Resultset;

import Account.Model.Account;
import Account.dao.AccountDao;

public class ServiceFunctions {
	private static AccountDao dao;
	public ServiceFunctions(AccountDao dao) {
		this.dao=dao;
	}

	public static Account create() throws ParseException
	{ 
			Date d= new Date();
			Scanner sc=new Scanner(System.in);
			DateFormat dt=new SimpleDateFormat("yyyy/mm/dd");
		
			System.out.println("Enter account Details : ");
			//int id=Account.getId();
			//System.out.println("Enter ID :");
			//int id=sc.nextInt();
			System.out.println("Enter Name :");
			String nm=sc.next();
			System.out.println("Enter Balance :");	
			float  b=sc.nextFloat();
			System.out.println("Enter Date of Opening (yyyy/mm/dd) Of Account :");
			d=dt.parse(sc.next());
			System.out.println("Enter Mobile Number :");
			String mo=sc.next();
			System.out.println("Enter Email Id :");
			String em=sc.next();
			Account ob1=new Account(nm,b,d,mo,em);
			//ob.put(id, ob1);
			return ob1;
	}

	public static ArrayList<Account> display()
	{
		ArrayList<Account> al=new ArrayList<Account>();
		ResultSet rs=dao.getData();
		System.out.println(rs);
		try {
			while(rs.next()) {
				Account a=new Account(rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getInt(4),rs.getFloat(5),rs.getDate(6),rs.getString(7),rs.getString(8));
				al.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}
	
	public static int insertProduct(Account a) {
		return dao.insertProductData(a);
	}
	
	public static void withdraw(int rs) throws SQLException {
		ResultSet ac=getByid(rs);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount you withdraw");
		float am=sc.nextFloat();
		while(ac.next()) {
			Account a=new Account(ac.getInt(1),ac.getString(2),ac.getFloat(3),ac.getInt(4),ac.getFloat(5),ac.getDate(6),ac.getString(7),ac.getString(8));
			float ba=a.getBalance()-am;
			int n=dao.setBalance(rs,ba);
			if(n>0) {
				System.out.println("Withdraw successfully");
			}
			else {
				System.out.println("unable to withdraw");
			}
		}
		
	}

	public static ResultSet getByid(int ac) throws SQLException {
		return dao.getId(ac);
	}
	
	public static void deposite(int rs) throws SQLException {
		ResultSet ac=getByid(rs);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount you want to Deposite");
		float am=sc.nextFloat();
		while(ac.next()) {
			Account a=new Account(ac.getInt(1),ac.getString(2),ac.getFloat(3),ac.getInt(4),ac.getFloat(5),ac.getDate(6),ac.getString(7),ac.getString(8));
			float ba=a.getBalance()+am;
			int n=dao.setBalance(rs,ba);
			if(n>0) {
				System.out.println("Deposite successfully");
			}
			else {
				System.out.println("unable to Deposite");
			}
		}
		
	}
	
	public static void CheckBalance(int rs) throws SQLException {
		ResultSet ac=getByid(rs);
		while(ac.next()) {
			Account a=new Account(ac.getInt(1),ac.getString(2),ac.getFloat(3),ac.getInt(4),ac.getFloat(5),ac.getDate(6),ac.getString(7),ac.getString(8));
			if(a.getAcc_id()==rs) {
				System.out.println("Balance is: "+a.getBalance());
			}
		}
	}

	public static void fundTransfer(int rs, int ac4) throws SQLException {
	
		ResultSet ac=getByid(rs);
		Scanner sc=new Scanner(System.in);
		
		System.out.println(ac);
		Account a=null;
		while(ac.next()) {
		 a=new Account(ac.getInt(1),ac.getString(2),ac.getFloat(3),ac.getInt(4),ac.getFloat(5),ac.getDate(6),ac.getString(7),ac.getString(8));
			}
		
		
		System.out.println("Enter the Amount you want to Transfer");
		float am=sc.nextFloat();
		ResultSet ac1=getByid(ac4);
		//System.out.println(ac);
		Account a1=null;
		while(ac1.next()) {
			 a1=new Account(ac1.getInt(1),ac1.getString(2),ac1.getFloat(3),ac1.getInt(4),ac1.getFloat(5),ac1.getDate(6),ac1.getString(7),ac1.getString(8));
			
		}
		float ba=a.getBalance()-am;
			System.out.println(ba);
			float ba1=a1.getBalance()+am;
			int n=dao.setBalance(rs,ba);
			//System.out.println(n);
			int n1=dao.setBalance(ac4,ba1);
			if(n>0 ) {
				System.out.println("Transfer successfully");
			}
			else {
				System.out.println("unable to Transfer");
			}

	}
}
