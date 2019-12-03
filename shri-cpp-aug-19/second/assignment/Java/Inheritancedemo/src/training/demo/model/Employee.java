package training.demo.model;

abstract public class Employee extends Person{
	String dept;
	String desg;
	public Employee() {
		 System.out.println("In Employee default constructor");
		 dept=null;
		 desg=null;
	}
	public Employee(int id,String nm,String em,String dept,String desg) {
		 super(id,nm,em);
		 System.out.println("In Employee parametrized constructor");
		 this.dept=dept;
		 this.desg=desg;
	}
	///setter getters
	public void setDept(String d) {
		dept=d;
	}
	public String getDept() {
		return dept;
	}
	public void setDesg(String d) {
		desg=d;
	}
	public String getDesg() {
		return desg;
	}
	
	
	
	public String toString() {
		
		return super.toString()+"\nDept: "+dept+"\nDesg: "+desg;
	}

}
