package training.demo.test;

import java.util.Scanner;

public class TestDivision {
	public static int division(int a,int b) {
		try {
		    return a/b;
		}catch(ArithmeticException ob) {
			System.out.println("cannot divide by 0");
			throw ob;
			//return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			//open files
			//reading data
			
			
		    int c=division(a,b);
		    System.out.println("The answer : "+c);
		   
		}catch(ArithmeticException ob) {
			System.out.println("cannot divide by 0 from main");
		}catch(NullPointerException ob) {
			ob.printStackTrace();
			System.out.println(ob.getMessage());
		}catch(Exception ob) {
			
		}
		finally {
			 //closing files
			System.out.println("In finally block");
			
		}

	}

}
