package training.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<3;i++) {
		try {
			System.out.println("enter data");
		   int d=sc.nextInt();
		   System.out.println("Data : "+d);
		   break;
		}catch(InputMismatchException ob) {
			System.out.println("Pls enter numbers");
			sc.next();
		}
		}
		if(i>=3) {
			System.out.println("Pls contact adminstrator, your chances are over");
		}
		
	}

}
