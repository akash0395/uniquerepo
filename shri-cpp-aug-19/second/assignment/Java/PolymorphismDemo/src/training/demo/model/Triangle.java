package training.demo.model;

public class Triangle extends ShapeImpl {
	private int height,s1,s2,base;
	public Triangle() {
		height=0;
		s1=0;
		s2=0;
		base=0;
	}
	public Triangle(int h,int b,int s1,int s2) {
		height=h;
		this.s1=s1;
		this.s2=s2;
		base=b;
	}
	public float area() {
		 return 0.5f*base*height;
	}
	public float perimeter() {
		 return base+s1+s2;
	}

}
