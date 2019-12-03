package training.demo.model;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	public Employee() {
		empid=0;
		ename=null;
		sal=0.0;
	}
	public Employee(int id,String nm,double s) {
		this.empid=id;
		ename=nm;
		sal=s;
	}
	public void setEmpId(int id)
	{
		this.empid=id;
	}	
	public int getEmpId() {
		
		return empid;
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
		return "Id: "+empid+"\nName: "+ename+"\nSalary: "+sal;
		
	}
	

}
