package Stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stacks<T> {
	ArrayList<Stack<T>> stacks;
	private final static int MAX_SIZE = 3;
	private int currStackSize;

	public Stacks() {
		currStackSize = 0;
		stacks = new ArrayList<Stack<T>>();

		Stack<T> s = new Stack<T>();
		stacks.add(s);
	}

	public void push(T data) {
		if (currStackSize < MAX_SIZE) {
			Stack<T> stackToAdd = stacks.get(stacks.size() - 1);
			stackToAdd.push(data);
			currStackSize++;
		} else {
			Stack<T> s = new Stack<T>();
			s.push(data);
			stacks.add(s);
			currStackSize = 1;
		}
	}

	public T peek() {
		if (stacks.size() == 0)
			throw new EmptyStackException();
		Stack<T> s = stacks.get(stacks.size() - 1);
		return s.peek();
	}

	public T pop() {
		if (stacks.size() == 0)
			throw new EmptyStackException();
		if (stacks.get(stacks.size() - 1).empty())
			throw new EmptyStackException();

		Stack<T> s = stacks.get(stacks.size() - 1);
		T data = s.pop();
		if (s.empty())
			stacks.remove(s);

		return data;
	}

	public T popAt(int index) {
		if (stacks.size() == 0)
			throw new EmptyStackException();
		if (index >= stacks.size())
			throw new ArrayIndexOutOfBoundsException();
		Stack<T> s = stacks.get(index);
		return s.pop();
	}

	public int size() {
		return stacks.size();
	}
}