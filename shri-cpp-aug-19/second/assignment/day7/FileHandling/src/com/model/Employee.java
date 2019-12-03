package com.model;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private int empId;
	private String ename;
	private float sal;
	
	
	
	
	public Employee() {
	}
	
	
	
	
	public Employee(int empId, String ename, float sal) {
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", sal=" + sal + "]";
	}
	

	
	
}
