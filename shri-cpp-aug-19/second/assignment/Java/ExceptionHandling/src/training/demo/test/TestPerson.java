package training.demo.test;

import training.demo.exception.AgeException;
import training.demo.model.Person;

public class TestPerson {
	public static void main(String[] args) {
		
		     try {
				Person p=new Person(123,"jashdjh",15);
			} catch (NullPointerException|AgeException|ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		     
		     
	}

}
