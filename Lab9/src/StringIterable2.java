import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringIterable2 implements Iterable<Character>{ 
	private String s;

	public StringIterable2(String string) { 
		s = string;
	}
	
	@Override // using anonymous inner class
	public Iterator<Character> iterator() { 
		return new Iterator<Character>() {
			private int count;
	
			// The next three methods implement Iterator. 
			public boolean hasNext() {
				return count < s.length();
			}
	
			public Character next() { 
				if (count == s.length())
				throw new NoSuchElementException(); count++;
				return s.charAt(count - 1);
			}
	
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}