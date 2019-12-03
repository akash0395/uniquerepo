package training.demo.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=null;
		//System.out.println("length:"+str.length());
	
int i;
for( i=0;i<3;i++)
{
	try {
		System.out.println("enter data");
int d=sc.nextInt();
System.out.println("data");

	
}
	
catch (InputMismatchException ob)
	{
	System.out.println("plz enter no");
	sc.next();
	}
}
if(i>=3) {
	
System.out.println("plz contact admin,you chance are over");	
}

	}
}
