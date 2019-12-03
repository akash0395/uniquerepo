package training.demo.thread;

public class MyTask implements Runnable{
	private int n;
	public MyTask(int x) {
		n=x;
	}
	public void run() {
		System.out.println("Hello ---> "+ n +"---->"+Thread.currentThread().getId());
		
	}

}
