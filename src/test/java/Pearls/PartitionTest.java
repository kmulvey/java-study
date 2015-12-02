package Pearls;

import org.junit.Assert;
import org.junit.Test;

public class PartitionTest {
	@Test
	public void oneTest() {
		int[] set = { 1, 1, 1, 2 };
		Assert.assertEquals(false, Partition.isEven(set));
	}

	@Test
	public void twoTest() {
		int[] set = { 3, 1, 1, 2, 2, 1 };
		Assert.assertEquals(true, Partition.isEven(set));
	}
	
	@Test
	public void threeTest() {
		int[] set = {4, 5, 6, 7, 8};
		Assert.assertEquals(true, Partition.isEven(set));
	}
	
	@Test
	public void fourTest() {
		int[] set = {1, 5, 11, 5};
		Assert.assertEquals(true, Partition.isEven(set));
	}
	
	@Test
	public void fiveTest() {
		int[] set = {1, 5, 3};
		Assert.assertEquals(false, Partition.isEven(set));
	}
	
}
