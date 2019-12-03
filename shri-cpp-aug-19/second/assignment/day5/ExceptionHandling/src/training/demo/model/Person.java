package training.demo.model;

import training.demo.exception.AgeException;

public class Person {
	
	int perid;
	int age;
	String name;
	
	public Person() {
		perid=0;
		name=null;
		age=0;
	}

public Person(int perid, int age, String name) throws AgeException,NullPointerException {
		this.perid = perid;

		this.name = name;
		
		if(age>=20 && age<=60)
		
			this.age = age;
	
		else
			throw new AgeException("age should be between 20 to 60");
		
		
	}


}
























	
	
	


