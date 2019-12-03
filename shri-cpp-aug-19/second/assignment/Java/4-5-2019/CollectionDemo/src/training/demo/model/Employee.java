package training.demo.model;

import java.util.Scanner;

public class Employee {
	private int id;
	private String ename;
	private double sal;
	public Employee() {
		id=0;
		ename=null;
		sal=0.0;
	}
	public Employee(int id,String nm) {
		this.id=id;
		ename=nm;
		sal=0.0;
	}
	public Employee(int id,String nm,double s) {
		
		this.id=id;
		this.ename=nm;
		sal=s;
				
	}
	public void setId(int id)
	{
		this.id=id;
	}	
	public int getId() {
		
		return id;
	}
	public void setName(String nm)
	{
		this.ename=nm;
	}	
	public String getEName() {
		
		return ename;
	}
	public void setSal(double s)
	{
		this.sal=s;
	}	
	public double getSal() {
		
		return sal;
	}
	public String toString() {
		return "Id: "+id+"\nName: "+ename+"\nSalary: "+sal;
		
	}
	@Override
	public boolean equals(Object e) {
		System.out.println("In employee equals method");
		//if((this.ename.equals(((Employee)e).ename)) && (this.id==((Employee)e).id))
		if(this.id==((Employee)e).id)
			return true;
		else 
			return false;
	}
	
	@Override
	public int hashCode() {
		System.out.println("Employee hashcode called");
		return id+ename.hashCode();
	}
	
	
	
}
