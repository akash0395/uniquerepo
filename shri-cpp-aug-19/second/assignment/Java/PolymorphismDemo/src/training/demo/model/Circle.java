package training.demo.model;

public class Circle extends ShapeImpl{
	    private int radius;
	    final float pi=3.142f;
		public Circle() {
			radius=0;
		}
		public Circle(int r) {
			
			radius=r;
		}
		public float area() {
			 return pi*radius*radius;
		}
		public float perimeter() {
			 return 2 *pi*radius;
		}

	

}
