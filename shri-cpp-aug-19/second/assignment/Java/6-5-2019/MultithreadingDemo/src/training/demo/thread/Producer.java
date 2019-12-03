package training.demo.thread;

import training.demo.model.Storage;

public class Producer extends Thread{

	private Storage s;
	
	public Producer(Storage s) {
		super();
		this.s = s;
	}

	public void run(){
		
		for (int i=1;i<=10;i++)
			s.put(i);
	}

}


