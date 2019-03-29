public class Circle extends Shape {
	private int radius;
	private static int PI = 3;
	
	Circle(int radius){
		super();
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	@Override
	public int getArea() {
		return PI * this.radius * this.radius;
	}
	
	@Override
	public String toString() {
		return "Cir[R=" + this.radius + " " + super.toString() + "]";
	}
}
