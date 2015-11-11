package Dynamic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PartitionTest {
	private Partition p;

	@Before
	public void setUp() {
		p = new Partition();
	}

	@Test
	public void oneWorker() {
		int[] hundreds = { 100, 100, 100, 100, 100, 100, 100, 100, 100 };
		Assert.assertArrayEquals(new int[] {}, p.solve(hundreds, 1));
	}

	@Test
	public void twoWorkers() {
		int[] hundreds = { 100, 200 };
		Assert.assertArrayEquals(new int[] { 1 }, p.solve(hundreds, 2));
	}

	@Test
	public void testIncremental() {
		int[] hundreds = { 100, 200, 300, 400, 500, 600, 700, 800, 900 };
	}
}
