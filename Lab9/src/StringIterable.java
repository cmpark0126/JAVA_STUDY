import java.util.Iterator;
import java.util.NoSuchElementException;

public class StringIterable implements Iterable<Character>{ 
	private String s;

	public StringIterable(String string) { 
		s = string;
	}
	
	@Override
	public Iterator<Character> iterator() { 
		return new StringIterator(this.s);
	}
}
	
class StringIterator implements Iterator<Character> {
		private String str; 
		private int count;
		
		public StringIterator(String s) {	// constuctor 
			str = s;
		}
		@Override
		public boolean hasNext() { 
			return count < str.length();
		}
		
		@Override
		public Character next() {
			if (count == str.length())
				throw new NoSuchElementException(); count++;
				return str.charAt(count - 1);
		}
		
		@Override
		public void remove() {
		throw new UnsupportedOperationException();
		}

}