package LinkedLists;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {
	@Test
  public void removeDups() {
		LinkedList ll = new LinkedList();
		ll.insertFirstLink("gatsby", 1);
		ll.insertFirstLink("mockingbird", 2);
		ll.insertFirstLink("catcher", 3);
		ll.insertFirstLink("siddhartha", 4);
		ll.insertFirstLink("catcher", 5);
		ll.insertFirstLink("gatsby", 6);
		ll.removeDups();
		Assert.assertEquals(4, ll.size());
	}
	
	@Test
  public void slice() {
		LinkedList ll = new LinkedList();
		ll.insertFirstLink("gatsby", 1);
		ll.insertFirstLink("mockingbird", 2);
		ll.insertFirstLink("catcher", 3);
		ll.insertFirstLink("siddhartha", 4);
		ll.insertFirstLink("catcher", 5);
		ll.insertFirstLink("gatsby", 6);
		LinkedList sliced = ll.slice(2, 4);
		
		Assert.assertEquals(3, sliced.size());
	}
}
