package Pearls;

import org.junit.Assert;
import org.junit.Test;


public class MaxSubvectorTest {

//	@Test
//	public void maxTest() {
//		int[] data = { 31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
//		Assert.assertEquals(MaxSubvector.max(data), 187);
//	}
//	@Test
//	public void singleValTest() {
//		int[] data = { 31};
//		Assert.assertEquals(MaxSubvector.max(data), 31);
//	}
//	@Test
//	public void zeroTest() {
//		int[] data = { 0 };
//		Assert.assertEquals(MaxSubvector.max(data), 0);
//	}
//	@Test
//	public void emptyTest() {
//		int[] data = { };
//		Assert.assertEquals(MaxSubvector.max(data), 0);
//	}
//	@Test
//	public void negativeTest() {
//		int[] data = { -31, -45 };
//		Assert.assertEquals(MaxSubvector.max(data), 0);
//	}
//	@Test
//	public void lonelyTest() {
//		int[] data = { -31, -41, 59 };
//		Assert.assertEquals(MaxSubvector.max(data), 59);
//	}
	
	@Test
	public void waveTest() {
		int[] data = { 0,1, 2,3,4,5,-6,-7, -8,-9, 10, 11, 12, 13, 14 };
		Assert.assertEquals(MaxSubvector.max(data), 60);
	}
}
