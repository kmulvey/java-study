package Pearls;

import org.junit.Assert;
import org.junit.Test;

public class RotateArrayTest {
	@Test
	public void findTest() {
		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		Integer[] expected = { 3, 4, 5, 6, 7, 1, 2 };
		RotateArray<Integer> ra = new RotateArray<Integer>();
		Assert.assertArrayEquals(expected, ra.rotate(nums, 2));
	}
}
