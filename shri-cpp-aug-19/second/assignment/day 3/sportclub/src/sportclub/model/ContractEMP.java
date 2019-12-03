package sportclub.model;

import java.util.Scanner;

public class ContractEMP extends Employee{
	
	private float dcharge;
	private  int wdays;
   public static void acceptdata(ContractEMP carr) {
		
		Scanner c=new Scanner(System.in);
	
			float dcharge=c.nextFloat();
			int wdays=c.nextInt();
			carr.setDcharge(dcharge);
			carr.setWdays(wdays);
		
	}
   
	public ContractEMP()
	{
		dcharge=0.0f;
		wdays=0;
	}
	
	public ContractEMP(int id,String name,String email,String dept,String desig,float charge,int days)
	{
		super(id,name,email,dept,desig);
		this.dcharge=charge;
		this.wdays=days;
		
	}
	
	public void setDcharge(float s)
	{
		this.dcharge=s;
	}
	
	public float getDcharge() {
		
		return dcharge;
	}
	
	public void setWdays(int b)
	{
		this.wdays=b;
	}
	
	public int getWdays() {
		return wdays;
	}
	public String toString() {
		
		return super.toString()+"\ndailycharge: "+dcharge+"\nworking days: "+wdays;
	}
	
}
