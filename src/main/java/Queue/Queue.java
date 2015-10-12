package Queue;

import java.util.EmptyStackException;

public class Queue<T> {
	private Node<T> first;
	private Node<T> last;

	public Queue() {

	}

	public boolean empty() {
		return (first == null);
	}

	public T peek() {
		if (this.empty())
			throw new EmptyStackException();
		return first.getData();
	}

	public T dequeue() {
		if (this.empty())
			throw new EmptyStackException();
		T data = first.getData();
		first = first.getPrev();
		first.setNext(null);
		return data;
	}

	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if (first == null) {
			first = newNode;
			last = newNode;
			first.setPrev(last);
		} else {
			newNode.setNext(last);
			last.setPrev(newNode);
			last = newNode;
		}
	}
}
