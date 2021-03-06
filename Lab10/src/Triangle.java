
public class Triangle extends Shape  {
	private int width;
	
	Triangle(int width){
		super();
		this.width = width;
	}
	
	@Override
	public int getArea() {
		return this.width * this.width / 2;
	}
	
	@Override
    public void draw(Canvas c) {
		System.out.println("draw : " + this.toString());
    }
	
	@Override
	public String toString() {
		return "Tri[W=" + this.width + " " + super.toString() + "]";
	}
}
