

public class WildCardLab {
  /////////////// Lab 3-2 /////////////////////////////
  /** Find the maximum in a stack of numbers */
	public static <E> double max(GenericStack<E> stack){
	    double max = ((Number)stack.pop()).doubleValue(); // initialize max
	    
	    while (!stack.isEmpty()) {
	      double value = ((Number)stack.pop()).doubleValue();
	      if (value > max)
	        max = value;
	    }
	
	    return max;
	}

  /////////////// Lab 3-3 /////////////////////////////
  /** Print objects and empties the stack */
	public static <E> void print(GenericStack<E> stack) {
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}


  /////////////// Lab 3-4 /////////////////////////////
  /** Remove(or pop) all items in f_stack to to_stack  */
	public static <E1, E2> void add(GenericStack<E1> f_stack, GenericStack<E2> to_stack) {
		while (!f_stack.isEmpty()) {
			to_stack.push((E2)f_stack.pop());
		}
	}

  public static void main(String[] args ) {
    System.out.println("----Lab3-2----");
    GenericStack<Integer> iStack = new GenericStack<>();
    iStack.push(1); // 1 is autoboxed into new Integer(1)
    iStack.push(2);
    iStack.push(-2);
    System.out.println("The max number is " + max(iStack)); // Compile Error:

    System.out.println("----Lab3-3----");
    iStack.push(1);       
    iStack.push(2);
    iStack.push(-2);
     print(iStack);

    System.out.println("----Lab3-4----");
    iStack.push(1);       
    iStack.push(2);
    GenericStack<Object> jStack = new GenericStack<>();
    jStack.push("Hello");
    jStack.push(-2);
    jStack.push("World");
    add(iStack, jStack);
    print(jStack);
  }
}