package Trees;

import java.util.Comparator;

import org.junit.Test;

public class BinarySearchTreeTest {
	@Test
	public void test() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(new IntCompare());
		bst.insert(8);
		bst.insert(3);
		bst.insert(1);
		bst.insert(6);
		bst.insert(6);
		bst.insert(4);
		bst.insert(7);
		bst.insert(10);
		bst.insert(14);
		bst.insert(13);
		// bst.prettyPrint(bst.getRootNode(), new ArrayList<String>(), 0);

		// bst.inOrderTraversal(bst.getRootNode());
		// bst.flip(bst.getRootNode());
		// bst.inOrderTraversal(bst.getRootNode());
	}

	@Test
	public void testArray() {
		BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(new IntCompare());
		Integer[] arr = { 1, 3, 4, 6, 7 }; // , 8, 10, 12, 14};
		bst.insertFromArray(arr);

		// bst.inOrderTraversal(bst.getRootNode());
	}
}

class IntCompare implements Comparator<Integer> {
	public int compare(Integer x, Integer y) {
		return x - y;
	}
}