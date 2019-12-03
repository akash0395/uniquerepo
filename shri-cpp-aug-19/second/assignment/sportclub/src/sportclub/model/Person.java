package sportclub.model;

import java.util.Scanner;

abstract public class Person {
	
	private int id;
	private String name;
	private String email;
    public static void acceptdata(Person sarr) {
		
		Scanner s=new Scanner(System.in);
		
			int id=s.nextInt();
			String name=s.next();
			String email=s.next();
			sarr.setId(id);
			sarr.setName(name);
			sarr.setMail(email);
    	}
	public Person()
	{
		id=0;              //default constructor
		name=null;
		email=null;
	}
	
	public Person(int id,String name,String email)  //parameterized constructor
	{
		this.id=id;
		this.name=name;         
		this.email=email;
	}
	
	//provide public setter and getter methods to access and update the value of a private variable
	
	public void setId(int i)               //setter / getter ->
	{ 
		this.id=i;
	}
	 
	public int getId()
	{
		return id;
	}
	
	public void setName(String n)
	{
		this.name=n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setMail(String m)
	{
		this.email=m;
	}
	
	public String getMail()
	{
		return email;
	}
	
	public String toString()
	{
		return "id="+id+"\nname="+name+"\nemail="+email;
	}

}
