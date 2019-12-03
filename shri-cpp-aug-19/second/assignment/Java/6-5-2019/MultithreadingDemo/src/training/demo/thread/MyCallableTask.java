package training.demo.thread;
import java.util.concurrent.*;
public class MyCallableTask implements Callable<Integer> {
	  private int n;
	  
	public MyCallableTask(int n) {
		super();
		this.n = n;
	}

	public Integer call() {
		System.out.println("My callable----> "+n);
		return n+10;
		
	}

}
