import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;

/** A simple class implementing a server based on a datagram socket. */
public class UDPServer {
  /** Port number used by the server.  */
  public static final int SERVER_PORT = 9832;

  public static void main( String[] args ) {
    // Make a socket for sending and receiving messages.
    DatagramSocket sock = null;
    try {
      sock = new DatagramSocket( SERVER_PORT );
    } catch( IOException e ){
      System.err.println( "Can't create socket: " + e );
      System.exit( -1 );
    }
    
    // Reusable packet for receiving messages, hopefully big enough
    // for any message we'll receive.
    byte[] recvBuffer = new byte [ 1024 ];
    DatagramPacket recvPacket = new DatagramPacket( recvBuffer, recvBuffer.length );

    // Keep reading messages and sending responses.
    try{
      while( true ){
        // Get a packet.
        sock.receive( recvPacket );

        // Turn it into a string.
        String str = new String( recvBuffer, 0, recvPacket.getLength() );

        // Let the user know we got something
        System.out.println( "Got: "+str+"\n" );
      
        // Change it, just to show we did something.
        str = "[" + str + "]";
        
        // Turn the string into a datagram packet, and send it back where the
        // message came from.
        byte[] sendBuffer = str.getBytes();
        DatagramPacket sendPacket = new DatagramPacket( sendBuffer, sendBuffer.length,
                                                        recvPacket.getAddress(),
                                                        recvPacket.getPort() );
        sock.send( sendPacket );
      }
    } catch( IOException e ){
      System.err.println( "Error communicating with a client." );
    }
  }
}
