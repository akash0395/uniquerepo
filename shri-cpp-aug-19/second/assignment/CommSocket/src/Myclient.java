import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Myclient {
	public static void main(String[] args)
	{
		Socket server;
		try {
			server = new Socket("localhost",1000);
			
			DataInputStream cis=new DataInputStream(server.getInputStream());
			
			DataOutputStream cos=new DataOutputStream(server.getOutputStream());
			
			cos.writeUTF("hello from client");
			
			String str=cis.readUTF();
			System.out.println("server say"+str);
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("client :");
			
			int num=sc.nextInt();
			cos.writeInt(num);
			
			
			/*do {
				
				System.out.println("client :");
				
				str=sc.next();
				
				cos.writeUTF(str);
				
				cis.readUTF();
				
				System.out.println("server :");
				
				
			}while(!str.equals("bye"));*/
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
