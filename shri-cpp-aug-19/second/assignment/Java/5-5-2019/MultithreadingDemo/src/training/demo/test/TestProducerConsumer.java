package training.demo.test;

import training.demo.model.Storage;
import training.demo.thread.Consumer;
import training.demo.thread.Producer;

public class TestProducerConsumer {

	public static void main(String[] args) {
		Storage s=new Storage();
		Producer p=new Producer(s);
		Consumer c=new Consumer(s);
		p.start();
		c.start();
		

	}

}
