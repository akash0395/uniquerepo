import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {

	public static void main(String[] args) {
		try {
			Socket server=new Socket("localhost",1000);
			DataInputStream cis=new DataInputStream(server.getInputStream());
			DataOutputStream cos=new DataOutputStream(server.getOutputStream());
			cos.writeUTF("Hello From Client...");
			String str=cis.readUTF();
			System.out.println("Server says :"+str);
			Scanner sc=new Scanner(System.in);
			do {
				System.out.println("Cilent : ");
				str=sc.next();
				cos.writeUTF(str);
				str=cis.readUTF();
				System.out.println("Server : "+str );
				
			}while(!str.equals("bye"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
