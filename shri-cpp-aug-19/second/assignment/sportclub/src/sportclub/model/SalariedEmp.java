package sportclub.model;

import java.util.Scanner;

public class SalariedEmp extends Employee{
	
	private float sal;
	private float bonus;
   public static void acceptdata(SalariedEmp sarr) {
		
		Scanner s=new Scanner(System.in);
	
			float sal=s.nextFloat();
			float bonus=s.nextFloat();
			sarr.setBonus(bonus);
			sarr.setSal(sal);
		
	}
	public SalariedEmp()
	{
		sal=0.0f;
		bonus=0.0f;
	}
	
	public SalariedEmp(int id,String name,String email,String dept,String desig,float sal,float bonus)
	{
		super(id,name,email,dept,desig);
		this.sal=sal;
		this.bonus=bonus;
		
	}
	
	public void setSal(float s)
	{
		this.sal=s;
	}
	
	public float getSal() {
		
		return sal;
	}
	
	public void setBonus(float b)
	{
		this.bonus=b;
	}
	
	public float getBonus() {
		return bonus;
	}
	public String toString() {
		
		return super.toString()+"\nsalary: "+sal+"\nBonus: "+bonus;
	}
	
}
