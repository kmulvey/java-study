package Trees;

import java.util.Comparator;

public class BinarySearchTree<T extends Comparable<T>> {
	private Node<T> rootNode;
	private Comparator<T> comparator;

	public BinarySearchTree(Comparator<T> comp) {
		rootNode = null;
		comparator = comp;
	}

	public Node<T> getRootNode() {
		return rootNode;
	}

	private int compare(T x, T y) {
		if (comparator == null)
			return x.compareTo(y);
		else
			return comparator.compare(x, y);
	}

	public void insert(T data) {
		Node<T> newNode = new Node<T>(data);
		if (rootNode == null)
			rootNode = newNode;
		else {
			Node<T> curr = rootNode;
			Node<T> parent;

			while (true) {
				parent = curr;
				// less than goes left
				int diff = compare(data, curr.getData());
				if (compare(data, curr.getData()) == 0) {
					return;
				} else if (compare(data, curr.getData()) < 0) {
					curr = curr.getLeft();
					if (curr == null) {
						parent.setLeft(newNode);
						return;
					}
				} else if (compare(data, curr.getData()) > 0) {
					curr = curr.getRight();
					if (curr == null) {
						parent.setRight(newNode);
						return;
					}
				}
			}
		}
	}

	public void inOrderTraversal(Node<T> n) {
		if (n != null) {
			inOrderTraversal(n.getLeft());
			System.out.println(n.getData());
			inOrderTraversal(n.getRight());
		}
	}

	public void flip(Node<T> n) {
		if (n != null) {
			Node<T> tmp = n.getLeft();
			n.setLeft(n.getRight());
			n.setRight(tmp);
			flip(n.getLeft());
			flip(n.getRight());
		}
	}
}
