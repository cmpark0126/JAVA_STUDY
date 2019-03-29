import java.util.Iterator;

public class StringIterableDriver {
	public static void main(String[] args) {
		StringIterable x = new StringIterable("Hello World");
		
		// StringIterable2 x = new StringIterable2("Hello World");
		
		for (char ch : x) System.out.print(ch + " ");
		
		System.out.println();
		
		StringIterable2 y = new StringIterable2("Why not"); 
		Iterator<Character> it = y.iterator();
		
		while (it.hasNext()) {
			char ch = it.next(); System.out.print(ch + " ");
		}
	}
}
