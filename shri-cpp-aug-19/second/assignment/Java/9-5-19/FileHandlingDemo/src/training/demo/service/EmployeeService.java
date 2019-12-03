package training.demo.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import training.demo.model.Employee;
import training.demo.model.MyObjectOutputStream;

public class EmployeeService {
	public static Employee acceptData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr data id and name");
		int id=sc.nextInt();
		String nm=sc.next();
		return new Employee(id,nm);
	}

	public static void writeData(File f, HashMap<Integer, Employee> hm) {
		
	
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(f));){
			
			Set<Integer> s=hm.keySet();
			s.forEach((k)->{try {
				System.out.println("writing"+hm.get(k));
				oos.writeObject(hm.get(k));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}});
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

	public static void appendData(File f, HashMap<Integer, Employee> hm, ArrayList<Integer> al) {
		try(MyObjectOutputStream oos=new MyObjectOutputStream(new FileOutputStream(f,true))){
			Set<Integer> s=hm.keySet();
		    for(Integer k:s) {
		    	if(!al.contains(k)) {
		    		System.out.println("writeing"+hm.get(k));
		    		oos.writeObject(hm.get(k));
		    	}
		    }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void displayAll(HashMap<Integer, Employee> hm) {
		Set<Integer> s=hm.keySet();
		for(Integer k:s) {
			System.out.println(k+"---->"+hm.get(k));
		}
		
	}

	public static Employee updateEmployee(Employee e) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name for updation");
		String nm=sc.next();
		return new Employee(e.getId(),nm);
	}	

}
