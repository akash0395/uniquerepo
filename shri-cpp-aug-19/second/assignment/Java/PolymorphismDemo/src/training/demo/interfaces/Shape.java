package training.demo.interfaces;

public interface Shape {
    float area();
    float perimeter();
    float pi=3.142f;
    default void  myfunction() {
    	System.out.println("In default myfunction");
    };
	
}
