package training.demo.model;

abstract public class Person {

	      private int id;
	      private String name;
	      private String email;
	      
	      //Default constructor
	      public Person() {
	    	  System.out.println("In person default constructor");
	    	  id=0;
	    	  name=null;
	    	  email=null;
	      }
	    //parametrized constructor
	      public Person(int id,String nm,String em){ 
	    	  System.out.println("In person parametrized constructor");
	    	  this.id=id;
	    	  name=nm;
	    	  email=em;
	      }
	      
	      //setters and getters
	      public void setId(int id) {
	    	  this.id=id;
	      }
	      public int getId() {
	    	  return id;
	      }
	      public void setName(String nm) {
	    	  this.name=nm;
	      }
	      public String getName() {
	    	  return name;
	      }
	      public void setEmail(String em) {
	    	  email=em;
	      }
	      public String getEmail() {
	    	  return email;
	      }
	      public String toString() {
	    	  System.out.println("In person toString");
	    	  return "Id : "+id+"\nName : "+name+"\nEmail : "+email;
	      }
}
