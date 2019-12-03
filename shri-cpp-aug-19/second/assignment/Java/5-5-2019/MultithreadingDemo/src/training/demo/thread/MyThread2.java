package training.demo.thread;

import training.demo.model.MyTable;

public class MyThread2 extends Thread{
	private MyTable b;
	public MyThread2(MyTable b) {
		super();
		this.b = b;
	}
	
	public void run() {
		b.printTable(7);
		
	}

	

}
