package Math;

import org.junit.Assert;
import org.junit.Test;


public class SwapTest {
	@Test
	public void fifteenTest() {
		Assert.assertEquals("51", Swap.addSwap(1,5));
	}
	@Test
	public void twentyeightTest() {
		Assert.assertEquals("82", Swap.addSwap(2,8));
	}
}
