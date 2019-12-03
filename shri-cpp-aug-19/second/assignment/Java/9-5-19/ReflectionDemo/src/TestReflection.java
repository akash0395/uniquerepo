import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TestReflection {

	public static void main(String[] args) {
		MyClass ob=new MyClass();
		Class cls=ob.getClass();
		Field[] fields=cls.getDeclaredFields();
		for(Field f1:fields) {
			
			System.out.println("name : "+f1.getName());
			System.out.println("Specifiers : "+f1.getModifiers());
			if(f1.getName().equals("id"))
				try {
					
					f1.setAccessible(true);
					//System.out.println("Value : "+f1.getInt(Integer.class));
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
			
		}
		Method[] mlist=cls.getDeclaredMethods();
		for(Method m:mlist) {
			
			System.out.println("Name : "+m.getName());
		}
		try {
			Method m=cls.getDeclaredMethod("method1",int.class);
			try {
				m.invoke(ob,12);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Constructor[] c=cls.getDeclaredConstructors();
		for(Constructor c1:c) {
			System.out.println(c1.getName());
			System.out.println(c1.getParameterCount());
			Parameter[] parr=c1.getParameters();
			for(Parameter p:parr) {
				System.out.println(p.getName());
			}
			
		}
		
		//static members
		System.out.println("Static members");
		Class cls1=MyClass.class;
		//Method[] smlist=cls1.getDeclareMethods();
		Method[] smlist=cls1.getMethods();
		for(Method m1:smlist) {
			System.out.println("Static method name :"+m1.getName());
		}
		Field[] sflist=cls1.getDeclaredFields();
		for(Field m1:sflist) {
			System.out.println("Static method name :"+m1.getName());
		}
		try {
			Method m=cls1.getDeclaredMethod("mystaticMethod");
			try {
				m.invoke(MyClass.class);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
