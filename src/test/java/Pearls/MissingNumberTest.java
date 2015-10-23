package Pearls;

import org.junit.Assert;
import org.junit.Test;

import Pearls.MissingNumber;

public class MissingNumberTest {

	@Test
	public void findTest() {
		int[] nums = { 6, 2, 5, 4, 10, 7, 9, 1, 8, 0 };
		Assert.assertEquals(3, MissingNumber.find(nums));
	}

	@Test
	public void findBitTest() {
		int[] nums = { 6, 2, 5, 4, 10, 7, 9, 1, 8, 0 };
		Assert.assertEquals(3, MissingNumber.findBit(nums));
	}

//	@Test
//	public void findBinarySearchTest() {
//		Integer[] nums = { 6, 2, 5, 4, 10, 7, 9, 1, 8, 0 };
//		Assert.assertEquals(3, MissingNumber.findBinarySearch(nums, 0));
//	}
}
