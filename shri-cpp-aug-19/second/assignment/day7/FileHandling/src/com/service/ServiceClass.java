package com.service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import com.model.Employee;

public class ServiceClass {
Scanner sc=new Scanner(System.in);
	public void createFile(String fname) throws IOException {
		// TODO Auto-generated method stub
		File f=new File(fname);
		if(!f.exists())
		{
			
		
	boolean i=f.createNewFile();
	if(i==true)
	{
		
		System.out.println("File successfully created.......");
		
	}
	else
	{
		System.out.println("File not created.......");
	}
		}
		
	}

	public void writeFile(String fname, Employee emp) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(fname);
			ObjectOutputStream dos=new ObjectOutputStream(fos);
			String str=sc.next();
			dos.writeObject(emp);
			dos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void readFile(String fname) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {
			fis = new FileInputStream(fname);
			ObjectInputStream dis=new ObjectInputStream(fis);
			Employee str=(Employee) dis.readObject();
			System.out.println("String is"+str);
			dis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	
	
	

}
