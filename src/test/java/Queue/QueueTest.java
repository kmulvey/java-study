package Queue;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QueueTest {

	@Test
	public void testQueue() {
		Queue<Integer> q = new Queue<Integer>();
		assertEquals(true, q.empty());

		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);

		assertEquals(false, q.empty());
		assertEquals(new Integer(5), q.peek());
		assertEquals(new Integer(5), q.dequeue());
		assertEquals(new Integer(4), q.dequeue());

		q.enqueue(100);

		assertEquals(new Integer(3), q.dequeue());
	}
}
