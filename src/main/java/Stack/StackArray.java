package Stack;

import java.util.ArrayList;

public class StackArray<T> {
	private ArrayList<T> collection;

	public StackArray() {
		collection = new ArrayList<T>();
	}

	public boolean empty() {
		return collection.isEmpty();
	}

	public T peek() {
		return collection.get(collection.size()-1);
	}

	public T pop() {
		return collection.remove(collection.size()-1);
	}

	public void push(T data) {
		collection.add(data);
	}
}
