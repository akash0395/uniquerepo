package training.demo.service;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import training.demo.model.Employee;

public class EmployeeService {

	public static void writeData(String fn) {
		String ans=null;
		File ob=new File(fn);
		Scanner sc=new Scanner(System.in);
		/*if(ob.exists()) {
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fn,true));}else{
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fn));
			}*/
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fn));) {
			do {
			Employee e1=EmployeeService.acceptdata();
			oos.writeObject(e1);
			System.out.println("continue(y/n)?");
			ans=sc.next();
			}while(ans.equals("y"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static Employee acceptdata() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter data");
		int id=sc.nextInt();
		String nm=sc.next();
		double s=sc.nextDouble();
		return new Employee(id,nm,s);
	}

	public static ArrayList<Employee> readData(String fn) {
		ArrayList<Employee> al=new ArrayList<>();
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.dat"));) {
			try {
			while(true) {
			Employee e1=(Employee)ois.readObject();
			al.add(e1);
			}
			}catch(EOFException e) {
				System.out.println("Reach to end of file.....");
			}
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return al;
	}

}
