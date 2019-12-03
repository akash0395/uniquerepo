package product.model;

abstract public class Product {
     private int pid;
     private String pname;
     private int qty;
     private double rate;
     private String desc;
     
     public Product(){
    	 setPid(0);
    	 pname=null;
    	 qty=0;
    	 setRate(0);
    	 setDesc(null);
     }
     public Product(int pid,String pname,int qty,double rate,String desc ) {
    	 
    	 this.setPid(pid);
    	 this.pname=pname;
    	 this.qty=qty;
    	 this.setRate(rate);
    	 this.setDesc(desc);
    	 
     }
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
     
	public String getpname() {
		return pname;
	}
	public void setpname(String pname) {
		this.pname = pname;
	}
     
	public int getqty() {
		return qty;
	}
	public void setqty(int qty) {
		this.qty = qty;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String toString() {
	return "\npid: "+pid+"\nPname: "+pname+"\nqty: "+qty+"\nRate: "+rate+"\nDesc: "+desc;
	}
 }
