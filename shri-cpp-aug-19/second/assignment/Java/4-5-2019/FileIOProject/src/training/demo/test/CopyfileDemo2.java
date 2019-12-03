package training.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyfileDemo2 {

	public static void main(String[] args) {
		 
		try(
			FileOutputStream fos=new FileOutputStream("Test.txt");
			FileInputStream fis=new FileInputStream("Test.txt");){
			
			int b=fis.read();
			while(b!=-1) {
				fos.write(b);
				b=fis.read();
			}
			System.out.println("Copied file");
		 
		}catch(IOException e) {
			
		}

	}

}
