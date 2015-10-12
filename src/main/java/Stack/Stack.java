package Stack;

import java.util.EmptyStackException;

public class Stack<T> {
	private Node<T> top;

	public Stack() {

	}

	public boolean empty() {
		return (top == null);
	}

	public T peek() {
		if (this.empty())
			throw new EmptyStackException();
		return top.getData();
	}

	public T pop() {
		if (this.empty())
			throw new EmptyStackException();
		T tmp = top.getData();
		top = top.getNext();
		return tmp;
	}

	public void push(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(top);
		top = newNode;
	}
}