

public class GenericStack<E> {
  private java.util.ArrayList<E> list = new java.util.ArrayList<>();

  public int getSize() {
    return list.size();
  }

  public E peek() {
    return list.get(getSize() - 1);
  }

  public void push(E o) {
    list.add(o);
  }

  ////////////////////////////////////////////////////
  // pop() returns the object at the top of the stack.
  // use ArrayList methods: get() and remove()
  // use GenericStack method: getSize()
  ///////////////Your code here //////////////////////
  
  public E pop() {
	  return list.remove(getSize() - 1);
  }

  ///////////////////////////////////////////////////

  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public String toString() {
    return "stack: " + list.toString();  // using Arraylist
  }

  public static void main(String[] args) {
	    GenericStack<String> s = new GenericStack<>();
	    s.push("All");
	    s.push("Have");
	    s.push("Sinned");

	    System.out.println(s); 		

	    while(!s.isEmpty())
	    	System.out.println(s.pop());

	    System.out.println(s);    	// now stack is empty
  }
}