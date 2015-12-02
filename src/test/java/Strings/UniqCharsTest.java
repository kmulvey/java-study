package Strings;

import org.junit.Assert;
import org.junit.Test;


public class UniqCharsTest {
	@Test
	public void fifteenTest() {
		Assert.assertEquals(true, UniqChars.hasUniqChars("sdf"));
		Assert.assertEquals(false, UniqChars.hasUniqChars("sddf"));
	}
}
