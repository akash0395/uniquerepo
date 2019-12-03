package training.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestDataStrem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try (DataOutputStream dos=new DataOutputStream(new FileOutputStream("mydatafile.dat"));
			 DataInputStream dis=new DataInputStream(new FileInputStream("mydatafile.dat"));){
			System.out.println("Enter data");  
			int id=sc.nextInt();
			String name=sc.next();
			double d=sc.nextDouble();
			dos.writeInt(id);
			dos.writeUTF(name);
			dos.writeDouble(d);
			System.out.println("Id : "+dis.readInt());
			System.out.println("Name : "+dis.readUTF());
			System.out.println("Double "+dis.readDouble());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
