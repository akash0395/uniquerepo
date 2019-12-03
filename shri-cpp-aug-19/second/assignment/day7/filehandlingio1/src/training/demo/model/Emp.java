package training.demo.model;

import java.io.Serializable;

public class Emp implements Serializable {
	
	private int id;
	private String name;
	private double sal;
	
	
	
	public Emp() {
		
		
	}



	public Emp(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSal() {
		return sal;
	}



	public void setSal(double sal) {
		this.sal = sal;
	}
	
	
	

}
