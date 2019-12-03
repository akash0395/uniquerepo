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

import training.demo.model.Emp;

public class EmpService {
	
	public static void writeData(String fn1) throws FileNotFoundException, IOException {
		String ans=null;
		
		File ob=new File (fn1);
	
	Scanner sc=new Scanner(System.in);
	
	
	if(ob.exists()) {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fn1,true));}
	
	else{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fn1));
		}
	
	try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fn1));) {
		
		do {
		Emp e1=EmpService.acceptdata();
		oos.writeObject(e1);
		System.out.println("continue(y/n)?");
		ans=sc.next();
		
	}while(ans.equals ("y"));
	
	
	
	
	}catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();

	}
	catch(IOException e) {
		
		e.printStackTrace();
	}
       
	}
	
	private static Emp acceptdata() {
             Scanner sc=new Scanner(System.in);
             
          System.out.println("enter id");   
             int id=sc.nextInt();
             System.out.println("enter name");
             String nm1=sc.next();
             System.out.println("enter sal");
             Double sal=sc.nextDouble();
           return  new Emp(id,nm1,sal);
	}
	
	public static ArrayList<Emp> readData(String fn1) {
		ArrayList<Emp> al=new ArrayList<>();
		
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("employee.dat"));) {
			try {
			
			while(true) {
				Emp e1=(Emp)ois.readObject();
				
				al.add(e1);
			}
			}
			catch(EOFException e ) {
				
				System.out.println("reach to the end of  file... ");
			}
				
		}
			catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return al;
		
	}
	
	}
