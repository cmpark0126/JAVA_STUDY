// Author: Youngsup Kim, idebtor@gmail.com
// Warming-up program for java.util.Stack
public class StackDriver {
	public static void main(String[] args) {
		java.util.Stack<Integer> s = new java.util.Stack<>();
//		 StackOfInts s = new StackOfInts();

		System.out.println("size:" + s.size() + "  capacity:" + s.capacity());
		s.trimToSize();
		System.out.println("size:" + s.size() + "  capacity:" + s.capacity());
		
		


		System.out.println("size:" + s.size() + "  capacity:" + s.capacity());
		
		System.out.println("size:" + s.size() + "  capacity:" + s.capacity());

		if (!s.empty()) s.clear();
	}
}
