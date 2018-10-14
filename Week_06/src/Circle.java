/**
 * Lecture Note: Chapter 09 - Class and Object
 * Encapsulation using visibility modifier - public/private
 * Constructors, no-arg constructor, this() 
 * 
 * variables: instance, static, local, this
 * variable types: primitive, reference
 * methods: instance method, static method
 *          override, @Override decorator
 * 
 * File: CircleDriver.java 
 * @author Youngsup Kim, idebtor@gmail.com
 */

public class Circle{
	// define instance and static variables 
	private int radius;
	private static int nCircles = 0;
	private static final double PI = 3.14;
	

	// no-arg constructor
	public Circle() {
		this(0); //아래에서 만들어져 있는 것을 계층적으로 아래에서 사용하도록 한다.
	}

	// constructor with an argument 
	public Circle(int radius) {
		this.radius = radius;
		nCircles++;
	}

	// define methods 
	

	/**
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}
	
	/**
	 * @return the nCircles
	 */
	public static int nCircles() {
		return nCircles;
	}
	
	
	public static double getPi() {
		return PI;
	}
	

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	/**
	 * @return area
	 */
	public double getArea() {
		return radius * radius * Math.PI;
	}


	/**
	 * @return string representation of the object
	 */
	@Override
	public String toString() {
		return "radius=" + radius;
	}


}
