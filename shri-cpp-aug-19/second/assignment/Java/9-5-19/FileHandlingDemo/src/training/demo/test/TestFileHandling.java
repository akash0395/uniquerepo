package training.demo.test;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import training.demo.model.Employee;
import training.demo.service.EmployeeService;

public class TestFileHandling {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch=0;
		HashMap<Integer,Employee> hm=new HashMap<>();
		ArrayList<Integer> al=new ArrayList<>();
		Employee e=null;
		File f=new File("empdata1.dat");
		///reading data from file
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(f))){
				while(true) {
					
					e=(Employee)ois.readObject();
					hm.put(e.getId(), e);
					al.add(e.getId());
					
				}
				
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}catch(EOFException e1) {
				System.out.println("Reached to end of file...");
			}
			catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		boolean aflag=false;
		boolean mflag=false;
		do {
			System.out.println("1.Add new Employee");
			System.out.println("2.delete Employee");
			System.out.println("3.update Employee");
			System.out.println("4.search Employee");
			System.out.println("5.Display All");
			System.out.println("6.Display by id");
			System.out.println("7.exit");
			System.out.println("Choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1:
				e=EmployeeService.acceptData();
				//check key exist and then add
				hm.put(e.getId(),e);
				if(aflag==false) {
					aflag=true;
				}
				
			case 2:
				break;
			case 3:
				System.out.println("Enter id for updation");
				int id=sc.nextInt();
				if(hm.containsKey(id)) {
				    e=hm.get(id);
				    Employee ue=EmployeeService.updateEmployee(e);
				    hm.put(id,ue);
				    if(mflag==false) {
				    	mflag=true;
				    }
				}
				else {
					System.out.println("not found");
				}
				break;
			case 4:
				break;
			case 5:
				EmployeeService.displayAll(hm);
				break;
			case 6:
				break;
			case 7:
				if(f.exists()) {
					if(mflag) {
						EmployeeService.writeData(f,hm);
						System.out.println("overwritten the file ");
					}
					else {
						if(aflag) {
							EmployeeService.appendData(f,hm,al);
							System.out.println("appended the file ");
						}else {
							
							System.out.println("no need to write");
						}
					}
					
				}
				else {
					
					EmployeeService.writeData(f,hm);
					System.out.println("overwritten the file ");
				}	
					
				
				break;
			}
			
			
			
			
		}while(ch!=7);
		

	}

}
