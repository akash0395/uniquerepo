import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
	
	public static void main(String[] args)
	{
		try {
			ServerSocket s=new ServerSocket(1000);
			
			System.out.println("server is waiting for client at port mo 1000");
			
			Socket client=s.accept();
			
			System.out.println("connected to client" +client.getRemoteSocketAddress());
			
			DataInputStream dis=new DataInputStream(client.getInputStream());
			
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			
			String str=dis.readUTF();
			
			System.out.println("client says :"+str);
			
			 dos.writeUTF("hello from server");
			 
			 Scanner sc=new Scanner(System.in);
			 
			 int num=dis.readInt();
			 int fact=1;
			 
			 for(int i=1;i<=num;i++)
			 {
				 fact=fact*i;
				 
			 }
			 
			 System.out.println("factorial of num ::"+fact);
			 
			 
			 
			 
			/* do {
				 
				 str=dis.readUTF();
				 System.out.println("client :"+str);
				 
				 System.out.println("server:");
				 str=sc.next();
				 
				 dos.writeUTF(str);
				 
				 
				 
				 
			 }while(!str.equals("bye"));*/
			 
			 
			 
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
