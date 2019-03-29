
public class Square extends Shape {
	private int length;
	
	Square(int length){
		super();
		this.length = length;
	}
	
	@Override
	public int getArea() {
		return this.length * this.length;
	}
	
	@Override
    public void draw(Canvas c) {
		System.out.println("draw : " + this.toString());
    }
	
	@Override
	public String toString() {
		return "Sqr[S=" + this.length + " " + super.toString() + "]";
	}
}
