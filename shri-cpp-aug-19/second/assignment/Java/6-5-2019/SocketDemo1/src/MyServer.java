import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args) {
		try {
			ServerSocket s=new ServerSocket(1000);
			System.out.println("Server is waiting for client at port 1000...");
			Socket client=s.accept();
			System.out.println("Connected to Client "+client.getRemoteSocketAddress());
			DataInputStream dis=new DataInputStream(client.getInputStream());
			DataOutputStream dos=new DataOutputStream(client.getOutputStream());
			String str=dis.readUTF();
			System.out.println("Client says : "+str);
			dos.writeUTF("Hello From Server");
			Scanner sc=new Scanner(System.in);
			do {
				str=dis.readUTF();
				System.out.println("Client : "+str);
				System.out.println("Server : ");
				str=sc.next();
				dos.writeUTF(str);
				
			}while(!str.equals("bye"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
