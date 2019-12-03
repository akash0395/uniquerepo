package product.model;

public class Perishable extends Product{
	
	 private String Edate;
	 private int cont;
	 
	 
	 public Perishable() {
		 
		 Edate=null;
		 cont=0;
	}
     
	public Perishable(int pid,String pname,int qty,double rate,String desc,String Edate,int cont)
	{
		super(pid,pname,qty,rate,desc);
		this.Edate=Edate;
		this.cont=cont;
	}

	public String getEdate() {
		return Edate;
	}

	public void setEdate(String edate) {
		Edate = edate;
	}

	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}
	
	public String toString() 
	{
		return super.toString()+"\nexpiry date:"+Edate+"\ncontent:"+cont;
	}
	
}
