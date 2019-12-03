package training.demo.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream{

	  public MyObjectOutputStream(OutputStream out) throws IOException {
		    super(out);
		  }

		 @Override
		  protected void writeStreamHeader() throws IOException {
		    // do not write a header, but reset:
		    // this line added after another question
		    // showed a problem with the original
		    reset();
		  }

		

}
