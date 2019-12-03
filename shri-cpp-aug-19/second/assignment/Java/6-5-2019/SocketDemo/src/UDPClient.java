import java.util.Scanner;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketTimeoutException;
import java.net.InetAddress;

/** A simple class implementing a client based on a datagram socket. */
public class UDPClient {
  /** Port number at which the client receives packets.  Has to be different
      from the server's port, in case we run on the same host. */
  public static final int CLIENT_PORT = 9831;

  public static void main( String[] args ) {
    // Make sure we have a reasonable number of command-line arguments.
    if ( args.length != 1 ) {
      System.err.println( "usage: Client <server_host>" );
      System.exit( 0 );
    }
 
    // Packet for receiving messages, hopefully big enough for any message we get.
    byte[] recvBuffer = new byte [ 1024 ];
    DatagramPacket recvPacket = new DatagramPacket( recvBuffer, recvBuffer.length );
    
    // Read a string from the user.
    Scanner console = new Scanner( System.in );
    System.out.print( "Message: " );
    String str = console.nextLine();

    try {
      // Make a socket for sending and receiving messages.
      DatagramSocket sock = new DatagramSocket( CLIENT_PORT );

      // Get the server's address just once.
      InetAddress[] addrList = InetAddress.getAllByName( args[ 0 ] );

      // Construct a packet containing the user's message.
      byte[] buffer = str.getBytes();
      DatagramPacket sendPacket = new DatagramPacket( buffer, buffer.length,
                                                      addrList[ 0 ],
                                                      UDPServer.SERVER_PORT );
      sock.send( sendPacket );
          
      // Get a response from the server.
      sock.receive( recvPacket );
          
      // Turn the response into a string, and print it.
      String response = new String( recvBuffer, 0, recvPacket.getLength() );
      System.out.println( "Response: " + response );

    } catch( IOException e ){
      System.err.println( "Error in communicating with the server" + e );
    } 
  }
}
