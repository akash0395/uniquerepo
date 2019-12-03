
public class MyClass {
	private int id;
	private String name;
	static int cnt=0;
	
	public MyClass() {
		super();
	}

	public MyClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
    public void method1(int n) {
    	System.out.println("in method 1"+n);
    	
    }
    public void method2() {
    	System.out.println("in method 2");
    	
    }
    public static void mystaticMethod() {
    	
    	System.out.println("In static method");
    	
    }
    
    
    
}
