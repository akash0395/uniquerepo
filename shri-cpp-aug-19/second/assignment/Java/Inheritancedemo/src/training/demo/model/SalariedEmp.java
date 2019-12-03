package training.demo.model;

public class SalariedEmp extends Employee{
	private float sal;
	private float bonus;
	public SalariedEmp() {
		sal=0.0f;
		bonus=0.0f;
	}
	public SalariedEmp(int id,String nm,String em,String dept,String desg,float sal,float bonus) {
		super(id,nm,em,dept,desg);
		this.sal=sal;
		this.bonus=bonus;
		
	}
	//sette getters
	public void setSal(float s) {
		sal=s;
	}
	public float getSal() {
		return sal;
	}
	public void setBonus(float b) {
		bonus=b;
	}
	public float getBonus() {
		return bonus;
	}
	
	public String toString() {
		return super.toString()+"\nSalary : "+sal+"\nBonus: "+bonus;
	}

}
