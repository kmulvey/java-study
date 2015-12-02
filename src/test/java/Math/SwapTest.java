package Math;

import org.junit.Assert;
import org.junit.Test;

public class SwapTest {
	@Test
	public void fifteenTest() {
		Assert.assertEquals("51", Swap.addSwap(1, 5));
		Assert.assertEquals("51", Swap.XORSwap(1, 5));
	}

	@Test
	public void twentyeightTest() {
		Assert.assertEquals("82", Swap.addSwap(2, 8));
		Assert.assertEquals("82", Swap.XORSwap(2, 8));
	}

	@Test
	public void seventyEightTest() {
		Assert.assertEquals("87", Swap.addSwap(7, 8));
		Assert.assertEquals("87", Swap.XORSwap(7, 8));
	}
}
