package city.model;

import java.util.ArrayList;

public class Trees {

	ArrayList<String> name;
	
	public Trees() 
	{
		name=new ArrayList<>();
	}
	
	public Trees(ArrayList<String> name) 
	{
		this.name = name;
	}
	
	public ArrayList<String> getName() {
		return name;
	}

	public void setName(ArrayList<String> name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Trees [name=" + name + "]";
	}

	
}
