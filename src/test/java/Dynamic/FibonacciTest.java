package Dynamic;

import java.util.Hashtable;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
	private final int N = 45;
	private final int EXPECTED = 1134903170 ;
	
	@Test
	public void testSlow() {
		Fibonacci f = new Fibonacci();
		Assert.assertEquals(EXPECTED, f.slow(N));
	}

	@Test
	public void testMedium() {
		Fibonacci f = new Fibonacci();
		Assert.assertEquals(EXPECTED, f.medium(N, new Hashtable<Integer, Integer>()));
	}

	@Test
	public void testFast() {
		Fibonacci f = new Fibonacci();
		Assert.assertEquals(EXPECTED, f.fast(N));
	}

	@Test
	public void testFastest() {
		Fibonacci f = new Fibonacci();
		Assert.assertEquals(EXPECTED, f.fastest(N));
	}
}
