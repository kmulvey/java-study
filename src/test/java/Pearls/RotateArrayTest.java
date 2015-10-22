package Pearls;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RotateArrayTest {
	private RotateArray<Integer> ra;

	@Before
	public void setUp() {
		ra = new RotateArray<Integer>();
	}

	@Test
	public void rotateLeftTest() {
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] expected = { 3, 4, 5, 6, 7, 1, 2 };
		Assert.assertArrayEquals(expected, ra.rotateLeft(nums, 2));
	}

	@Test
	public void rotateRightTest() {
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] expected = { 6, 7, 1, 2, 3, 4, 5 };
		Assert.assertArrayEquals(expected, ra.rotateRight(nums, 2));
	}
}
