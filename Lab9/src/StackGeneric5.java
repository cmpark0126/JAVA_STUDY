import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StackGeneric5 <T> implements Iterable<T>{
	private List<T> list = new ArrayList<>();
	private int size;
	private int capacity;
	
	public StackGeneric5() {
		size = 0;
		capacity = 0;
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
	
	public T peek() {
		return list.get(size - 1);
	}
	
	public void push(T item) {
		if(size == capacity) {
			size++;
			capacity++;
			list.add(item);
		} else {
			list.set(size++, item);
		}
		
	}
	
	public T pop() {
		return list.get(--size);
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		size = 0;
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
	@Override
	public Iterator<T> iterator() { 
		return list.iterator();
	}
}