package training.demo.test;

import training.demo.model.MyTable;
import training.demo.thread.MyThread1;
import training.demo.thread.MyThread2;

public class TestThread {

	public static void main(String[] args) {
		MyTable ob=new MyTable();
		MyTable ob1=new MyTable();
		//ob.printTable(3);
		MyThread1 th1=new MyThread1(ob);
		th1.setName("thread1");
		th1.setPriority(Thread.MIN_PRIORITY);
		
		//ob.printTable(7);
		MyThread2 th2=new MyThread2(ob1);
		th2.setName("thread2");
		th2.setPriority(Thread.MAX_PRIORITY);
		th1.start();
		th2.start();
		try {
			th1.join();
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of Main thread");
	}

}
