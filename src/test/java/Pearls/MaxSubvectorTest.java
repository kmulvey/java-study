package Pearls;

import org.junit.Assert;
import org.junit.Test;


public class MaxSubvectorTest {

	@Test
	public void findTest() {
		int[] data = { 31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
		Assert.assertEquals(MaxSubvector.max(data), 187);
		
	}
}
