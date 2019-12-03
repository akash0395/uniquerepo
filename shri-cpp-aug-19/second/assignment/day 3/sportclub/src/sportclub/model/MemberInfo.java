package sportclub.model;

public class MemberInfo extends Person{

	String address;
	int fees;
	
	public MemberInfo()
	{
		address=null;
		fees=0;
	}
	
	public MemberInfo(int id,String name,String email,String add,int fee)
	{
		super(id,name,email);
		address=add;
		fees=fee;
	}
	
	public void setAdd(String ad)
	{
		this.address=ad;
	}
	
	public String getAdd()
	{
		return address;
	}
	
	public void setFee(int fe)
	{
		this.fees=fe;
	}
	
	public int getFee()
	{
		return fees;
	}
	
	public String toString()
	{
		return super.toString()+"\naddress="+address+"\nfees"+fees;
	}
	
}
