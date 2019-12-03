package training.demo.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.util.Scanner;

public class CopyFiledDemo {
	
public static void main(String[] args) {	

  try
  {
BufferedOutputStream bos=new  BufferedOutputStream(new FileOutputStream("Text12.txt"));
BufferedInputStream bis=new BufferedInputStream(new FileInputStream("Text.txt"));
 
	  
	  int b=bis.read();
	  while(b!=-1) {
		  bos.write(b);
		  b=bis.read();
		  System.out.println("copied");
	  }
	  bos.close();
	  bis.close();
	  System.out.println("copied file");
	  
  }catch(IOException e) {
	  
	  System.out.println("sxdsjhdhg");
	  e.printStackTrace();
	  
	  
  }
 
		  
}
}
