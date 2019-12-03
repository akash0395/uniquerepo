package training.demo.test;

import java.util.Scanner;

public class TestDivison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter data");
		
			int a=sc.nextInt();
			//sc.nextLine();
			int b=sc.nextInt();
			try{
				int c=divison(a,b);
			    System.out.println("the divison is:"+c);
			}
			catch(ArithmeticException ob) {
				
			//System.out.println("cannot divide by zero");	
			ob.printStackTrace();	
			
			
			}
			
			
			catch(NullPointerException ob) {
				
				//System.out.println("cannot divide by zero");	
				ob.printStackTrace();	
				
				System.out.println(ob.getMessage());
				}
				
			
			
			finally
			{
				System.out.println("finally block");
				
			}
	
	}
	private static int divison(int a, int b) {
		// TODO Auto-generated method stub
		
		int p=a/b;
		
		return p;
	}
}

