package sportclub.model;

import java.util.Scanner;

public class ItemInfo {

	
	int itemno;
	String Iname;
	int qty;
	int rate;
	
	public static void acceptitem(ItemInfo items) {
		//items.setIname("sds");
		//items.setIno(12);
		Scanner sc=new Scanner(System.in);
		int itemno=sc.nextInt();
		String Iname=sc.next();
		int qty=sc.nextInt();
		int rate=sc.nextInt();
		items.setIno(itemno);
		items.setIname(Iname);
		items.setQty(qty);
		items.setRate(rate);
		
	}
	
	public ItemInfo()
	{
		itemno=0;
		Iname=null;
		qty=0;
		rate=0;
	}
	
	public ItemInfo(int ino,String iname,int qty,int rate)
	{
		this.itemno=ino;
		this.Iname=iname;
		this.qty=qty;
		this.rate=rate;
	}
	
	public void setIno(int im)
	{
		this.itemno=im;
	}
	
	public int getIno()
	{
		return itemno;
	}
	
	public void setIname(String inam)
	{
		this.Iname=inam;
	}
	
	public String getIname()
	{
		return Iname;
	}
	
	public void setQty(int q)
	{
		this.qty=q;
	}
	
	public int getQty()
	{
		return qty;
	}
	
	public void setRate(int r)
	{
		this.rate=r;
	}
	
	public int getRate()
	{
		return rate;
	}
	
	public String toString()
	{
		return "\nitemno="+itemno+"\niname"+Iname+"\nQuantity="+qty+"\nrate="+rate;
	}
}
