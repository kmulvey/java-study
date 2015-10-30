package Dynamic;

import java.util.Hashtable;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
	@Test
	public void testSlow() {
		Fibonacci f = new Fibonacci();
		Assert.assertEquals(1134903170, f.slow(45));
	}

	@Test
	public void testMedium() {
		Fibonacci f = new Fibonacci();
		Assert.assertEquals(1134903170, f.medium(45, new Hashtable<Integer, Integer>()));
	}

}
