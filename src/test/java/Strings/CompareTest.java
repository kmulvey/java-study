package Strings;

import org.junit.Assert;
import org.junit.Test;

public class CompareTest {
	@Test
	public void testRecurseEditDist() {
		Compare c = new Compare();
		Assert.assertEquals(1, c.recurseEditDist("shot", "spot", 3, 3));
		Assert.assertEquals(2, c.recurseEditDist("shot", "spit", 3, 3));

		Assert.assertEquals(1, c.recurseEditDist("programmer", "programmers", 9, 10));
	}
}
