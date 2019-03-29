import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackOfIntsIterable implements Iterable<Integer> {
	private int[] elements;
	private int size;
	private static final int DEFAULT_CAPACITY = 10;

	/** Construct a stack with the default capacity */
	public StackOfIntsIterable() {
		this(DEFAULT_CAPACITY);
	}
	/** Construct a stack with the specified capacity */
	public StackOfIntsIterable(int capacity) {
		elements = new int[capacity];
	}

	/** Push a new integer into the top of the stack */
	public void push(int item) {
		if(elements.length == size) {
			int[] temp = null;
			if(size != 0) {
				temp = new int[size * 2];
				for(int i = 0; i < size; i ++) {
					temp[i] = elements[i];
				}
			} else {
				temp = new int[size + 1];
			}
			
			elements = temp;
		}
		elements[size++] = item;
	}

	/** Return and remove the top element from the stack */
	public int pop() {
		if (size == 0) throw new java.util.EmptyStackException();
		if(elements.length == size * 4) {
			int[] temp = new int[size * 2];
			for(int i = 0; i < size; i ++) {
				temp[i] = elements[i];
			}
			elements = temp;
		}
		
		return elements[--size];
	}

	/** Return the top element from the stack */
	public int peek() {
		return elements[size() - 1];
	}

	/** Return true if the stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** Return the number of elements in the stack */
	public int size() {
		return size;
	}

   /** Return the capacity of the stack */
	public int capacity() {
		return elements.length;
	}

	/** Make the stack empty */
	public void clear() {
		size = 0;
	}
	
	public void trimToSize() {
		int[] temp = new int[size];
		for(int i = 0; i < size; i ++) {
			temp[i] = elements[i];
		}
		elements = temp;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		if(size > 0) {
			for(int i = 0; i < size - 1; i ++) {
				sb.append(String.valueOf(elements[i]));
				sb.append(", ");
			}
			sb.append(String.valueOf(elements[size - 1]));
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	public Iterator<Integer> iterator() { 
		return new Iterator<Integer>() {
			private int count;
	
			// The next three methods implement Iterator. 
			public boolean hasNext() {
				return count < size;
			}
	
			public Integer next() { 
				if (count == size)
				throw new NoSuchElementException(); count++;
				return elements[count - 1];
			}
	
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
