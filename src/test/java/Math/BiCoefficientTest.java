package Math;

import org.junit.Assert;
import org.junit.Test;


public class BiCoefficientTest {
	@Test
	public void testCalcBinomialCoeffiecent() {
		Assert.assertEquals(1, BiCoefficient.calcBinomialCoeffiecent(4, 0));
		Assert.assertEquals(4, BiCoefficient.calcBinomialCoeffiecent(4, 1));
		Assert.assertEquals(6, BiCoefficient.calcBinomialCoeffiecent(4, 2));
		Assert.assertEquals(4, BiCoefficient.calcBinomialCoeffiecent(4, 3));
		Assert.assertEquals(1, BiCoefficient.calcBinomialCoeffiecent(4, 4));
		Assert.assertEquals(10, BiCoefficient.calcBinomialCoeffiecent(5, 3));
	}
}
