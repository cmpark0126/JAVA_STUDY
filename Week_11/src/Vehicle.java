/*
 * Lecture note: 
 *  inheritance and polymorphism
 * 	super class and subclass 
 * 	super() and super.(dot)
 *  abstract method, abstract class
 *  Comparable interface and Comparator interface
 * 
 * 	Comparable interface has compareTo(T obj) method which is used 
 *  by sorting methods. We should override this method in such a way 
 *  that it returns a negative integer, zero, or a positive integer 
 *  if "this" object is less than, equal to, or greater than the 
 *  object passed as argument.
 *  
 *  The Comparable interface is only allow to sort a single property. 
 *  To sort with multiple properties, you need Comparator interface.
 *	
 *  Comparator interface requires to implement compare(Object o1, 
 *  Object o2) method that takes two Objects as arguments.
 *  There are three ways to implement Comparator interface. 
 *  1. Using a class that implements the Comparator interface which 
 *     must override the compare method. 
 *  2. Using an anonymous class that implements Comparator interface.
 *     It creates a static object in the class that implement Comparator
 *     interface which overrides the compare method.
 *  3. Using an anonymous class that implements Comparator interface.
 *     This is coded directly in Collections.sort() or ~.sort().     
 *     It is usually used for one time use only case. 
 *        
 */

public abstract class Vehicle {
	private int capacity;
	private String name;
	
	public Vehicle() {
		this(0, "vehicle");
	}
	
	public Vehicle(int capa, String name) {
		this.capacity = capa;
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract Boolean isFlyable();
	
	public void canYouFly() {
		  System.out.println("Name:" + getName() + "Flyable?:" + isFlyable());  
	}

	@Override
	public String toString() {
		return "V[C=" + capacity + ", N=" + name + "]";
	}
	
}

class Car extends Vehicle {
	private int numWheels;
	
	public Car() {
		this(4, "car");
	}
	
	public Car(int capa, String name) {
		super(capa, name);
		numWheels = 4;
	}

	@Override
	public Boolean isFlyable() {
		return false;
	}

	@Override
	public String toString() {
		return "Car[W=" + numWheels + super.toString() + "]";
	}
	
	
}

class Air extends Vehicle {
	private int numWheels;
	
	public Air() {
		this(0, "air");
	}
	
	public Air(int capa, String name) {
		super(capa, name);
		numWheels = 3;
	}

	@Override
	public Boolean isFlyable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String toString() {
		return "Air[W=" + numWheels + "]";
	}
}


