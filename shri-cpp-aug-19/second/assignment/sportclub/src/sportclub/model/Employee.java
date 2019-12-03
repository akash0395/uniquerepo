package sportclub.model;

import java.util.Scanner;

abstract public class Employee extends Person{
	
	String dept;
	String desig;
public static void acceptdata(Employee sarr) {
		
		Scanner s=new Scanner(System.in);
		
			String dept=s.next();
			String desig=s.next();
			sarr.setDept(dept);
sarr.setDesig(desig);
}
	public Employee()
	{
		dept=null;
		desig=null;
	}
	
	public Employee(int id,String name,String email,String dept,String desig)
	{
		super(id,name,email);
		this.dept=dept;
		this.desig=desig;
	}

	public void setDept(String d)
	{
		this.dept=d;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setDesig(String de)
	{
		this.desig=de;
	}
	
	public String getDesig()
	{
		return desig;
	}
	
	public String toString()
	{
		return super.toString()+"\nDept="+dept+"\ndesig="+desig;
	}
}
