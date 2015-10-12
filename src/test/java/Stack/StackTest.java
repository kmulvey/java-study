package Stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import Stack.Stack;

public class StackTest {

	@Test
	public void testStack() {
		Stack<Integer> s = new Stack<Integer>();
		assertEquals(true, s.empty());

		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);

		assertEquals(false, s.empty());
		assertEquals(new Integer(1), s.peek());
		assertEquals(new Integer(1), s.pop());
		assertEquals(new Integer(2), s.pop());

		s.push(100);

		assertEquals(new Integer(100), s.pop());
	}
	
	@Test
	public void testStackArray() {
		StackArray<Integer> s = new StackArray<Integer>();
		assertEquals(true, s.empty());

		s.push(5);
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);

		assertEquals(false, s.empty());
		assertEquals(new Integer(1), s.peek());
		assertEquals(new Integer(1), s.pop());
		assertEquals(new Integer(2), s.pop());

		s.push(100);

		assertEquals(new Integer(100), s.pop());
	}
}
