package training.demo.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import training.demo.thread.MyTask;

public class TestExecutorServiceDemo {

	public static void main(String[] args) {
		ExecutorService s=Executors.newFixedThreadPool(3);
		for(int i=1;i<=10;i++) {
			
			s.execute(new MyTask(i));
		}
	}

}
