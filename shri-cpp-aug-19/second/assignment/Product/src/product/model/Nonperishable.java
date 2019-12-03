package product.model;

public class Nonperishable extends Product{
	
	 private int wper;
	 
	 public Nonperishable()
	 {
		 wper=0;
	 }
	 
	 public Nonperishable(int pid,String pname,int qty,double rate,String desc,int wper)
	 {
		 super(pid,pname,qty,rate,desc);
		 this.wper=wper;
	 }
	 
	 public int getWper() 
	 {
		return wper;
	 }
	 
	 public void setWper(int wper) 
	 {
		this.wper = wper;
	 }
	 
	 public String toString() 
	 {
		return super.toString()+"\nwarrenty period:"+wper;
	 }

	
}
