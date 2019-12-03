package training.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileDemo {

	public static void main(String[] args) throws IOException {
		//File f=new File("Test.txt");
		//f.createNewFile();
	                    
		
		try(
				
				FileOutputStream fos=new FileOutputStream("Test.txt");
				FileInputStream fis=new FileInputStream("Test.txt");)
		
		{
			
			DataOutputStream dos=new DataOutputStream(fos);
			
			dos.writeUTF("fghkjhkdfjhgjhjdfhgfkhkjdhgjdfjghdfhgjdfuirgeytiureiuytr ue7ytityreuiyt re8yt");
			
			DataInputStream dis=new DataInputStream(fis);
			String str=dis.readUTF();
			System.out.println("String is"+str);
				
				
				}catch(IOException e) {
				
			}

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		/*FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			
			//fos=new FileOutputStream("Test.txt");
			fis=new FileInputStream("Test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
			
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println("in the final");
				e.printStackTrace();
			}
			
		}
		try {
			fos=new FileOutputStream("Test.txt");
			int b=fis.read();
			while(b!=-1) {
				
				fos.write(b);
				b=fis.read();
				
			}
			System.out.println("copied file");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
*/

