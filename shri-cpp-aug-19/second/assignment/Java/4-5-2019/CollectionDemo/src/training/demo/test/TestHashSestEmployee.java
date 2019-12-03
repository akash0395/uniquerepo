package training.demo.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import training.demo.model.Employee;

public class TestHashSestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Set<Employee> hs=new HashSet<>();
		hs.add(new Employee(12,"aaa",11111));
		hs.add(new Employee(13,"aaa",11111));
		hs.add(new Employee(14,"aaa",11111));
		boolean choice=hs.add(new Employee(12,"aaa",11111));
		if(choice==false) {
			System.out.println("Duplicate value");
		}
		System.out.println(hs);
		/*hs.remove(new Employee(12,"aaa",11111));
		System.out.println(hs);
		System.out.println(hs.contains(new Employee(14,"aaa",11111)));*/
		System.out.println("----------------------------------------");
		System.out.println("enter id");
		int id=sc.nextInt();
		Iterator<Employee> it=hs.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			if(e.getId()==id) {
			    System.out.println("deleted");
			    it.remove();
			}
			else {
				System.out.println(e);
			}
		}
		System.out.println("------for loop----------------------------------");
		for(Employee e:hs) {
			System.out.println(e);
		}
		
       
	}

}
