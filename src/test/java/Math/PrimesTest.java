package Math;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class PrimesTest {
	@Test
	public void testPrimes() {
		ArrayList<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		Assert.assertEquals(expected, Primes.getPrimes(10));
	}
}
