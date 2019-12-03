package training.demo.interfaces;

public interface I1 {
	void m1();
	void m2();
	default int m3() {
		System.out.println("in m3 default method");
		return 45;
	}

}
