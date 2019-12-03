package training.demo.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ans;
		ArrayList<String> ob=new ArrayList<>();
		ArrayList<String> ob1=new ArrayList<>();
		ob1.add("Kishori");
		ob1.add("Rajan");
		do {
				System.out.println("Enter name");
				String nm=sc.next();
				ob.add(nm);
				System.out.println("do you want to continue?(y/n)");
				ans=sc.next().charAt(0);
		}while(ans=='y');
		
		for(String s:ob) {
			
			System.out.println("value : "+s);
		}
		Iterator<String> it=ob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		//indexof it calls equals method
		System.out.println("position of Rohit" +ob.indexOf("Rohit"));
		System.out.println("position of Rohit" +ob.contains("Rohit"));
		System.out.println("position of Rohit" +ob.containsAll(ob1));
		ob.addAll(ob1);
		ob.remove(2);
		ob.remove("Rohit");
		System.out.println(ob);
	}
	

}
