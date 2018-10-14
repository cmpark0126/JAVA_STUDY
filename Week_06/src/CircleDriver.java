/**
 * Lecture Note: Chapter 09 - Class and Object
 * Encapsulation using visibility modifier, 
 * Constructors, no-arg constructor, this() 
 * 
 * variables: instance, static, local, this
 * variable types: primitive, reference
 * methods: instance method, static method
 *          override, @Override decorator
 * 
 * Lab 5
 * 1. Instantiate two circles in two different ways
 * 	  - by default and by a radius given
 * 2. Change radius of one circle and print the result
 * 3. Compute areas of area of one circle
 * 4. Print two circles
 * 	  - implement (override) toString()
 *    - use @Override decorator
 * 5. Count number of circles created
 *    - use static 
 * 6. Implement the following methods in CircleDriver 
 *    - use for-each loop if possible
 *    - createCircles(int N): returns an array of N circles
 *      its radius (int type) is set to randomly in [0..N-1]
 *    - getAreas(Circle[] circles): returns sum of areas
 *  
 *  Sample run:
 *  myC: 0
 *  myC: 1
 *  urC: 1
 *  urC area: 3.141592653589793
 *  myC: radius=2
 *  urC: radius=1
 *  There are 2 circles.
 *  radius=4
 *  radius=0
 *  radius=2
 *  radius=0
 *  radius=2
 *  Total Area: 75.39822368615503
 *  There are 7 circles.
 *  
 * @author Youngsup Kim, idebtor@gmail.com
 */
public class CircleDriver {
	// createCircles() returns an array of N circles created
	// and initialized with a radius randomly set between
	// [0..N] int value.
	public static Circle[] createCircles(int N) {
		Circle[] arrayOfCircles = new Circle[N];
		
		for(int i = 0; i < N; i++) {
			int random = (int)(Math.random() * N);
			arrayOfCircles[i] = new Circle(random);
		}
		
		return arrayOfCircles;
	}
	
	
	// getAreas() returns total area of an array of circles  
	public static double getAreas(Circle[] arrayOfCircles) {
		double total = 0.f;
		
		for(Circle c : arrayOfCircles) total += c.getArea();
		
		return total;
	}
	


	public static void main(String[] args) {
		// create a circle, myC, using no-arg constructor
		// print its radius
		
		Circle myC = new Circle();
		System.out.println("myC: " + myC.getRadius());

		
		// create a circle, urC, with radius = 1
		// print radii of myC and urC
		Circle urC = new Circle(1);
		System.out.println("myC: " + myC.getRadius());
		System.out.println("urC: " + urC.getRadius());
		
		// get area of urC and print it
		System.out.println("urC: " + urC.getArea());

		
		// set myC's radius to 2
		myC.setRadius(2);
		// print radii of myC and urC using toString()
		System.out.println(myC);
		System.out.println(urC);
		
		// print the number of circles created so far
		// "There are N circles."
		System.out.printf("There are %d circles.\n", Circle.nCircles());
		
		// create an array of N circles using createCircles()
		int N = 5;
		
		Circle[] arrayOfCircles = createCircles(N);
		
		// print N circles one by one - using toString()
		
		for(Circle c : arrayOfCircles) System.out.println(c);
		
		// print the total area of N circles
		System.out.println("Total Area: " + getAreas(arrayOfCircles));
		
		
		// print the total number of circles existed now:
		System.out.printf("There are %d circles.\n", Circle.nCircles());


	}
}
