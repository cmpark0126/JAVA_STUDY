
public class Point extends Shape {
	private int x;
	private int y;
	
	Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int getArea() {
		return 0;
	}
	
	@Override
    public void draw(Canvas c) {
		System.out.println("draw : " + this.toString());
    }
	
	@Override
	public String toString() {
		return "Poi[x=" + this.x + " " + super.toString() + "]";
	}
}
