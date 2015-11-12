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
		Assert.assertArrayEquals(new int[] {}, p.solveRecursive(hundreds, 1));
		Assert.assertArrayEquals(new int[] {}, p.solveDynamic(hundreds, 1));
	}
	
	@Test
	public void evenLength() {
		int[] hundreds = { 100, 100, 100, 100, 100, 100, 100, 100, 100 };
		Assert.assertArrayEquals(new int[] {3,6}, p.solveRecursive(hundreds, 3));
		Assert.assertArrayEquals(new int[] {3,6}, p.solveDynamic(hundreds, 3));
	}
	
	@Test
	public void evenWork() {
		int[] hundreds = { 100, 100, 100, 100, 200, 200, 400};
		Assert.assertArrayEquals(new int[] {4,6}, p.solveRecursive(hundreds, 3));
		Assert.assertArrayEquals(new int[] {4,6}, p.solveDynamic(hundreds, 3));
	}

	@Test
	public void twoWorkers() {
		int[] hundreds = { 100, 200 };
		Assert.assertArrayEquals(new int[] { 1 }, p.solveRecursive(hundreds, 2));
		Assert.assertArrayEquals(new int[] { 1 }, p.solveDynamic(hundreds, 2));
	}

	@Test
	public void testIncremental() {
		int[] hundreds = { 100, 200, 300, 400, 500, 600, 700, 800, 900 };
		Assert.assertArrayEquals(new int[] { 5,7 }, p.solveRecursive(hundreds, 3));
		Assert.assertArrayEquals(new int[] { 5,7 }, p.solveDynamic(hundreds, 3));
	}
}
