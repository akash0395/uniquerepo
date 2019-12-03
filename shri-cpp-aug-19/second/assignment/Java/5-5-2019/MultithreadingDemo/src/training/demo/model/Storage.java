package training.demo.model;

public class Storage {
	private int n;
	private boolean vflag;
	
synchronized public void put(int i)
{
	if (vflag)
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  n=i;
	  System.out.println("put : "+i);
	  vflag=true;
	  notify();
	}
synchronized public void get()
{
	if (!vflag)
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 System.out.println("got:"+n);
	  vflag=false;
	  notify();
	}

}
