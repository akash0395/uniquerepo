package training.demo.model;

public class Product {
	private int pid;
	private String pname;
	private String pdesc;
	
	public Product() {
		super();
	}

	public Product(int pid, String pname, String pdesc) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdesc = pdesc;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pdesc=" + pdesc + "]";
	}
	

}
