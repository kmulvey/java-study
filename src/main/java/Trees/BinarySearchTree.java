package Trees;

import java.util.ArrayList;
import java.util.Arrays;
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

	// insert from array while minimizing height of tree
	public void insertFromArray(T[] vals) {
		if (vals.length == 0)
			return;
		if (vals.length == 1)
			insert(vals[0]);
		else {
			int middle = vals.length / 2;
			insert(vals[middle]);
			insertFromArray(Arrays.copyOfRange(vals, 0, middle));
			insertFromArray(Arrays.copyOfRange(vals, middle + 1, vals.length));
		}
	}

	public void prettyPrint(Node<T> n, ArrayList<String> levels, int level) {
		if (n != null) {
			int next = level + 1;
			if (level < levels.size())
				levels.set(level, levels.get(level) + " " + n.getData());
			else
				levels.add(level, n.getData().toString());
			prettyPrint(n.getLeft(), levels, next);
			prettyPrint(n.getRight(), levels, next);
			
			for(String l: levels){
				System.out.println(l);
			}
		}
	}
}
