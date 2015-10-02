package LinkedLists;

import java.util.HashMap;

public class LinkedList {
	Link firstLink;

	LinkedList() {
		firstLink = null;
	}

	public boolean isEmpty() {
		return (firstLink == null);
	}

	public void insertFirstLink(String name, int num) {
		Link newLink = new Link(name, num);
		newLink.next = firstLink;
		firstLink = newLink;
	}

	public Link removeFirstLink() {
		if (isEmpty()) {
			System.out.println("Empty list");
			return null;
		} else {
			Link linkRef = firstLink;
			firstLink = firstLink.next;
			return linkRef;
		}
	}

	public void traverse() {
		Link curr = firstLink;
		while (curr != null) {
			curr.display();
			curr = curr.next;
		}
	}

	public int size() {
		Link curr = firstLink;
		int result = 0;
		while (curr != null) {
			result++;
			curr = curr.next;
		}
		return result;
	}

	public Link find(String name) {
		if (isEmpty()) {
			System.out.println("Empty list");
			return null;
		} else {
			Link curr = firstLink;
			while (curr != null) {
				if (curr.bookName.equals(name))
					return curr;
				curr = curr.next;
			}
			return null;
		}
	}

	public void removeDups() {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(firstLink.bookName, 1);
		Link curr = firstLink;
		while (curr.next != null) {
			if (map.containsKey(curr.next.bookName)) {
				if (curr.next.next != null) {
					curr.next = curr.next.next;
				} else {
					curr.next = null;
					return;
				}
			} else {
				map.put(curr.next.bookName, 1);
			}
			curr = curr.next;
		}
	}

	public LinkedList slice(int start, int end) {
		LinkedList result = new LinkedList();
		Link curr = firstLink;
		Link[] linkArr = new Link[end - start + 1];
		int i = 1, arrIterator=0;
		while (curr != null) {
			if (i >= start && i <= end) {
				linkArr[arrIterator] = curr;
				arrIterator++;
			}
			curr = curr.next;
			i++;
		}
		for(i = 0; i<linkArr.length; i++){
			result.insertFirstLink(linkArr[i].bookName, linkArr[i].numSold);
		}
		return result;
	}
}
