package training.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyfileDemo {

	public static void main(String[] args) {
		 
		try(
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("myfile.txt"));
			BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Test.txt"));){
			
			int b=bis.read();
			while(b!=-1) {
				bos.write(b);
				b=bis.read();
			}
			System.out.println("Copied file");
		 
		}catch(IOException e) {
			
		}

	}

}
