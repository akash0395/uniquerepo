package training.demo.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo2 {
	public static void main(String[] args) {
		 
		try(
			FileOutputStream fos=new FileOutputStream("Test11.txt");
			FileInputStream fis=new FileInputStream("Test1.txt");){
			
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



