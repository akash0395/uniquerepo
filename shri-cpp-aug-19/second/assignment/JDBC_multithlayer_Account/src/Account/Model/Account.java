package Account.Model;

import java.util.Date;

public class Account {

	private static int min_bal=1000;
	private static float ir=8;
	
	private int acc_id;
	private String name;
	private float balance;
	private  Date date_of_op;
	private  String mob;
	private  String email;
	 
	public Account(int id,String name, float balance,int min_bal,float ir,Date date_of_op, String mob, String email) {
		
		
	    this.acc_id=id;
	    this.min_bal=min_bal;
	    this.ir=ir;
		this.name = name;
		this.balance = balance;
		this.date_of_op = date_of_op;
		this.mob = mob;
		this.email = email;
		
	}
	
	public Account(String name, float balance, Date date_of_op, String mob, String email) {
		super();
		this.name = name;
		this.balance = balance;
		this.date_of_op = date_of_op;
		this.mob = mob;
		this.email = email;
	}

	public Account() {
		//this.acc_id=id++;
		this.name = null;
		this.balance = 0;
		this.date_of_op = null;
		this.mob =null;
		this.email = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}


	/*public static void setId(int id) {
		Account.id = id;
	}*/

	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getMin_bal() {
		return min_bal;
	}

	/*public void setMin_bal(int min_bal) {
		this.min_bal = min_bal;
	}*/

	public float getIr() {
		return ir;
	}

	/*public void setIr(float ir) {
		this.ir = ir;
	}*/

	public Date getDate_of_op() {
		return date_of_op;
	}

	public void setDate_of_op(Date date_of_op) {
		this.date_of_op = date_of_op;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Account [acc_id="+acc_id+",name=" + name + ", balance=" + balance + ", min_bal=" + min_bal + ", ir=" + ir
				+ ", date_of_op=" + date_of_op + ", mob=" + mob + ", email=" + email + "]";
	}



	

	

	
	

}
