import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

/** 
 * Lecture note: Thinking in Objects
 * @author Youngsup Kim <p>
 * The StackOfIntegers class implements an iterable stack that holds ints.
 * <p> 
 * 
 * Topics: 
 * Stack - LIFO
 * 	- Review Java class Stack: 
 *		. size, capacity, push(), pop(), peek(), clear(), empty()
 *		. trimToSize()
 * 
 *  - Implement StackOfIntegers
 *  	. when and how doubling capacity, reducing capacity
 *  	. System.arraycopy()
 *  	. print stack? - toString(), String vs StringBuilder
 *  	. stack empty? 
 *  - Use EmptyStackException, throw-try-catch
 * 	- Why using size(), capacity() instead of getSize(), getCapacity()
 *  - No Side-Effect: not printing in class definition
 *  - Throwing exception: IllegalArgumentException, EmptyStackException
 *  
 *  Things to do:
 *  - Generic Stack
 *  - Iterable Stack
 */

public class StackOfIntsLab {
	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 2;
	
	/** Construct a stack with the default capacity */
	public StackOfIntsLab() {
		this(DEFAULT_CAPACITY );
	}
	
	/** Construct a stack with the specified maximum capacity */
	public StackOfIntsLab(int capacity) {	
		if (capacity < 0) throw new IllegalArgumentException("Non-negative number expected."); // developer do not use print alternatively use exception
		elements = new int[capacity];
	}

	/**
	 * Push a new int into the top of the stack 
	 * Double the stack capacity when size > capacity().
	 * */
	public void push(int item) {
		if (size >= capacity()) {
			int[] temp = new int[capacity() * 2];
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		}
		elements[size++] = item;
	}

	/**
	 * Return and remove the top element from the stack 
	 * Reduce the stack capacity in half when  
	 * (size * 4 <= capacity())
	 */
	public int pop(){
		if(empty()) {
//			System.out.println("Stack is empty"); // Don't use print on general method
			throw new EmptyStackException();
//			return -1; // Don't repeat yourself
			// No Side effect
		}
		if (size * 4 <= capacity()) {
			int[] temp = new int[capacity() / 2];
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		}
		return elements[--size];
	}

	/** Return the top element from the stack */
	public int peek() {
		if(empty()) throw new EmptyStackException();
		return elements[size-1];
	}
	
	/** Test whether the stack is empty */
	public boolean empty() {	
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int size() {
		return size;
	}
	
	public int capacity() {
		return elements.length;
	}
	
	/** Make the stack empty */
	public void clear() {
		size = 0;
		elements = new int[DEFAULT_CAPACITY];
	}
	
	/** make it fit tight */
	public void trimToSize() {
		// resize elements to capacity
		if (capacity() > size) {
			int[] temp = new int[size];
			System.arraycopy(elements, 0, temp, 0, size);
			elements = temp;
		}
	}
	
	/*
	 * Returns a string repr. of stack
	 * For example: "[1, 2, 4]"
	 */
	@Override
	public String toString(){
		String delimiter = ", ";
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size; i++) 
			sb.append(elements[i] + delimiter);
		int i = sb.lastIndexOf(delimiter);   // remove the last ", " if any.
		if (i > 0) sb.delete(i, i+2);
		
		sb.append("]");
		return sb.toString();
	}
	
	// = operator override
	

	public static void main(String[] args) {
		try {
			Stack<Integer> as = new Stack<>();
			// push 
			for (int i = 0; i < 5; i++)
				as.push(i);

			// print stack
			System.out.println(as);
			as.trimToSize();
//			as.clear();
			System.out.println("size : " + as.size());
			System.out.println("capa : " + as.capacity());
			
			StackOfIntsLab mystack = new StackOfIntsLab(5);
			for (Integer item: as) {
				mystack.push(item);
			}
			
			System.out.println("mystack: " + mystack);
			System.out.println("pop: " + mystack.pop());
			System.out.println("pop: " + mystack.pop());
			System.out.println("mystack: " + mystack);
	//
//			// instantiate a stack
			StackOfIntsLab urstack = new StackOfIntsLab();
			for (Integer item: as) {
				urstack.push(item);
			}
			System.out.println("urstack: " + urstack);
			
		} catch (EmptyStackException e) {
			System.out.println("My stck is empty.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(elements);
		result = prime * result + size;
		return result;
	}

	@Override
	public boolean equals(Object obj) { // on the test 
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false; // Class name
		
		StackOfIntsLab other = (StackOfIntsLab) obj;
		if (!Arrays.equals(elements, other.elements)) return false;
		if (size != other.size) return false;
		return true;
	}
}
