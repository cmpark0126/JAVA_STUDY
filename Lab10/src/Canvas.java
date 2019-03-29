import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Canvas {
	public <E> void draw(E s) {
		((Shape)s).draw(this);
	}

    ////////////// Rewrite drawAll method /////////////////
	public <E> void drawAll(List<E> shapes) {
		for (E s: shapes) {
			((Shape)s).draw(this);
		}
	}

    ////////////// Rewrite equalArea method ///////////////
    public static <E> boolean equalArea(E o1, E o2) {
       return ((Shape)o1).getArea() == ((Shape)o2).getArea();
    }

	public static void main(String[] args) {
		Canvas myCanvas = new Canvas();

		// create four objects
		Circle s1 = new Circle(2);
		Square s2 = new Square(6);
		Triangle s3 = new Triangle(3);
		Point s4 = new Point(0, 0);
		Circle s5 = new Circle(2);

		myCanvas.draw(s1);

		// create an array of three Shape objects and
		// initialize the array with the Shape objects created above;
		Shape[] myArr = new Shape[] {s1, s2, s3, s4};

		// create an arraylist using an existing array
		// instead of using add() one by one, use Arrays.asList()
		// to form a List object from an array
		List<Shape> arrList = new ArrayList<>(Arrays.asList(myArr));
		System.out.println(arrList);

		Circle[] cirArr = new Circle[] {new Circle(1), new Circle(2)};

		List<Circle> cirList = new ArrayList<>(Arrays.asList(cirArr));
		myCanvas.drawAll(arrList);
		myCanvas.drawAll(cirList);

         System.out.println("equalArea(s1, s2)=" + Canvas.equalArea(s1, s2));
         System.out.println("equalArea(s1, s5)=" + Canvas.equalArea(s1, s5));
	}
}