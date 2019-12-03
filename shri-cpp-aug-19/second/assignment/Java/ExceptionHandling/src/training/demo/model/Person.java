package training.demo.model;

import training.demo.exception.AgeException;

public class Person {
	int perid;
	String name;
	int age;
	public Person() {
		perid=0;
		name=null;
		age=0;
	}
	public Person(int id,String nm,int a) throws AgeException,NullPointerException{
		perid=id;
		name=nm;
		if(a>=18 && age<=60)
		    age=a;
		else
			 throw new AgeException("age should be between 18 and 60");
			
			
	}

}
