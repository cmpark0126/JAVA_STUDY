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

public class StackOfIntegersLab {
	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 16;

	/** Construct a stack with the default capacity */
	public StackOfIntegersLab() {
		this(DEFAULT_CAPACITY); // we select 16 as default capacity
	}
	/** Construct a stack with the specified maximum capacity */
	public StackOfIntegersLab(int capacity) {
		elements = new int[capacity];
	}

	/**
	 * Push a new int into the top of the stack 
	 * Double the stack capacity when size > capacity().
	 * */
	public void push(int item) {
		if(size >= elements.length) { // for trimToSize
			int [] temp = new int[elements.length * 2];
			for (int i = 0; i < size; i++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		elements[size++] = item;
//		System.out.println(elements[size-1]);
	}

	/**
	 * Return and remove the top element from the stack 
	 * Reduce the stack capacity in half when  
	 * (size * 4 <= capacity())
	 */
	public int pop() {
		if((size-1) * 4 <= elements.length) {
			int [] temp = new int[elements.length / 2];
			for (int i = 0; i < size; i++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		return elements[--size];
	}

	/** Return the top element from the stack */
	public int peek() {
		return elements[size-1];
	}
	
	/** Test whether the stack is empty */
	public boolean empty() {
		return (size == 0)? true : false;
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
		// reset array with default size
	}
	
	/** make it fit tight */
	public void trimToSize() {
		// resize elements to capacity
		int [] temp = new int[size];
		for (int i = 0; i < size; i++) {
			temp[i] = elements[i];
		}
		elements = temp;
	}
	
	/*
	 * Returns a string repr. of stack
	 * For example: "[1, 2, 4]"
	 */
	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[");
		// StringBuilder s;
		for(int i = 0; i < size - 1; i++) {
			s.append(elements[i] + ", ");
		} // how to create string more efficiency // with string buffer // string builder 
		s.append(elements[size - 1]);
		s.append("]");
		return s.toString();
		// return s.toString();
	}
	
	public static void main(String[] args) {
		/* part1 */
		Stack<Integer> as1 = new Stack<>();
		as1.push(1);
		as1.push(3);
		as1.push(7);
		as1.push(17);
		System.out.println(as1);
		StackOfIntegersLab s1 = new StackOfIntegersLab();
		for(Integer one : as1) {
			s1.push(one);
		}
		System.out.println(s1);

		/* part2 */
		System.out.println("DEFAULT_CAPACITY: " + s1.capacity());
		StackOfIntegersLab s2 = new StackOfIntegersLab(3);
		System.out.println("s2's capacity: " + s2.capacity()+", size: " + s2.size()+"\n");
		for(int i = 0; i<4;i++) {
			s2.push(i*10);
		}
		System.out.println("s2: " + s2.toString());
		System.out.println("size: " + s2.size() +", capacity: " +s2.capacity());
		s2.pop();
		s2.pop();
		s2.pop();
		System.out.println("s2: " + s2.toString());
		System.out.println("size: " + s2.size() +", capacity: " +s2.capacity());
		s2.push(-10);
		s2.trimToSize();
		if(s2.empty()) {
			System.out.println("s2 is empty");
		} else {
			System.out.println("s2 is not empty");
			System.out.println("s2: " + s2.toString());
			System.out.println("size: " + s2.size() +", capacity: " +s2.capacity());
			System.out.println("peek: " + s2.peek());
		}
	
		s2.clear();
		System.out.println("clear!");
//		s2.trimToSize();
		if(s2.empty()) {
			System.out.println("size: " + s2.size() +", capacity: " +s2.capacity());
			System.out.println("s2 is empty");
		} else {
			System.out.println("s2 is not empty");
			System.out.println("s2: " + s2.toString());
			System.out.println("size: " + s2.size() +", capacity: " +s2.capacity());
		}
	}
}
