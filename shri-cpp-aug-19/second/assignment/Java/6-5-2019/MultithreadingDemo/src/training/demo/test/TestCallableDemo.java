package training.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import training.demo.thread.MyCallableTask;

public class TestCallableDemo {

	public static void main(String[] args) {
		ExecutorService s=Executors.newFixedThreadPool(3);
		List<Future<Integer>> al=new ArrayList<>();
		for(int i=10;i<=20;i++) {
			Future<Integer> e=s.submit(new MyCallableTask(i));
			al.add(e);
		}
		al.forEach((s1)->{try {
			System.out.println(s1.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}});
		

	}

}
