/**
 * Lecture note by idebtor@gmail.com
 * 
 *  inheritance and polymorphism
 * 	super class and subclass 
 * 	super() and super.(dot)
 *  abstract method, abstract class
 *  Comparable interface and Comparator interface
 *  Functional interface
 */

import java.util.ArrayList;
import java.util.Arrays;

public class VehicleDriver {
	public static void main(String[] args) {
		Car v1 = new Car();
		Car v2 = new Car(8, "mycar");
		Vehicle v3 = new Air(2, "myair");
		
		v1.canYouFly();
		v2.canYouFly();
		v3.canYouFly();
		
		int[] myi = {4, 3, 7, 1};
		System.out.println(Arrays.toString(myi));
		
		Vehicle[] myv = {v1, v2, v3};
		System.out.println(Arrays.toString(myv));
		
		// create an arraylist using an existing array
		// instead of using add() one by one, use Arrays.asList()
		// to form a List object from an array 
		ArrayList<Vehicle> arrList = new ArrayList<>(Arrays.asList(myv));
		System.out.println(arrList);
		
		// List is an interface, and ArrayList is an implementing class. 
		// It's almost always preferable to code against the interface and 
		// not the implementation. This way, if you need to change the 
		// implementation later, it won't break consumers who code against 
		// the interface.
				
		
		// sort vehicles by capacity		
		System.out.println("---Using Comparable interface---");


		
		// sort by using Comparator interface, implemented as a class
		
		System.out.println("---Case 1: Using Comparator and a class---");
		
		
		System.out.println("By name:" + arrList);
		
		System.out.println("By door:" + arrList);
		
		System.out.println("By capa:" + arrList);
		
		System.out.println("---Case 2: Using Comparator and a static object---");
		// A static object is created by 'new SortByCapa()'.
		// Since it is a static object, it is invoked using 
		// in the form of Classname.object
		

		System.out.println("By door:" + arrList);
		
		System.out.println("---Case 3: Using Comparator and anonymous class---");
		// Using an anonymous class and anonymous object  
		// sort arrList. Use Collections.sort() and make an object
		// that overrides compare()

		
		
		
		System.out.println("By name:" + arrList);
		System.out.println("---Case 4: Using Functional interface---");
	}
}
