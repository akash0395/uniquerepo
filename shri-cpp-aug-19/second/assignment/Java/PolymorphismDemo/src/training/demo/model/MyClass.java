package training.demo.model;

import training.demo.interfaces.I1;
import training.demo.interfaces.I2;
import training.demo.interfaces.I3;

public class MyClass implements I2,I1,I3 {

	@Override
	public void m1() {
		System.out.println("In m1 method");
		
	}

	@Override
	public void m2() {
		// System.out.println("In m2 method");
		
	}

	@Override
	public void m31() {
		System.out.println("In m31 method");
		
	}

	@Override
	public void m32() {
		System.out.println("In m32 method");
		
	}

	
	public void m21() {
		System.out.println("In m21 method");
		
	}

	
	public void m22() {
		System.out.println("In m22 method");
		
	}

}
