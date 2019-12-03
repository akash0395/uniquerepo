package com.test;

public class TestStrings {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3="Welcome";
		String s4=new String("Hello");
		System.out.println("hashcode s1= "+s1.hashCode());
		System.out.println("hashcode s2= "+s2.hashCode());
		System.out.println("hashcode s3= "+s3.hashCode());
		System.out.println("hashcode s4= "+s4.hashCode());
		if(s1==s2) {
			System.out.println("equal object");
		}
		else{
			System.out.println("not equal object");
		}
		if(s1==s4) {
			System.out.println("equal object");
		}
		else{
			System.out.println("not equal object");
		}
		if(s1.equals(s4)){
			System.out.println("equal value");
		}
		else{
			System.out.println("not equal value");
		}
		StringBuffer s=new StringBuffer("hello");
		s.append(" world");
		System.out.println("String buffer object : "+s);

	}

}
