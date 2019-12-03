import java.util.function.Consumer;
import java.util.function.Supplier;

public class TestIntefaces {

	public static void main(String[] args) {
		Consumer<String> c=(s)->{
			System.out.println("in consumer c");
			System.out.println(s);};
		c.accept("Hello");
		c.accept("Kishori");
		
		Supplier<String> s=()->{return "Greet from supplier";};
		System.out.println(s.get());
		
	}

}
