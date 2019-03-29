import java.util.ArrayList;
import java.util.List;

public class StackGeneric {
	private List<Integer> list = new ArrayList<>();
	private int size;
	private int capacity;
	
	public StackGeneric() {
		size = 0;
		capacity = 0;
	}
	
	public boolean empty() {
		return list.isEmpty();
	}
	
	public int peek() {
		return list.get(size - 1);
	}
	
	public void push(int item) {
		if(size == capacity) {
			size++;
			capacity++;
			list.add(item);
		} else {
			list.set(size++, item);
		}
		
	}
	
	public int pop() {
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
	
}
