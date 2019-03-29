import java.text.SimpleDateFormat;
import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {
	private java.util.Date time;

	Shape(){
		this.time = new java.util.Date();
	}

	public java.util.Date getTime() {
		return time;
	}

	public void setTime(java.util.Date time) {
		this.time = time;
	}
	
	public abstract int getArea(); 
	
	public abstract void draw(Canvas c);
	
	@Override
	public String toString() {
		SimpleDateFormat df = new SimpleDateFormat("mm:ss");
		return "Time[" + df.format(this.getTime()) + "]";
	}

	@Override
    public int compareTo(Shape otherStudent) {
        return this.getArea() - otherStudent.getArea();
    }
	
	// Create a static object called AreaComparator
   	public static Comparator<Shape> AreaComparator = new Comparator<Shape>() {
   		@Override
   		public int compare(Shape a, Shape b) {
   			return a.getArea() - b.getArea();
   		}
   	};
   	
   	// Create a static object called TimeComparator
   	public static Comparator<Shape> TimeComparator = new Comparator<Shape>() {
   		@Override
   		public int compare(Shape a, Shape b) {
   			SimpleDateFormat df = new SimpleDateFormat("mm:ss");
   	        return (df.format(a.getTime()).compareTo(df.format(b.getTime())));
   		}
   	};
}
