package training.demo.thread;

import training.demo.model.MyTable;

public class MyThread1 extends Thread {
	private MyTable a;
	
	
	public MyThread1(MyTable a) {
		super();
		this.a = a;
	}

	 public void run() {
		
		synchronized(this) {a.printTable(3);}
		
	}

}
