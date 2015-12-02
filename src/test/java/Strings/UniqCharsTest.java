package Strings;

import org.junit.Assert;
import org.junit.Test;


public class UniqCharsTest {
	@Test
	public void asciiTest() {
		Assert.assertEquals(true, UniqChars.hasUniqChars("sdf"));
		Assert.assertEquals(false, UniqChars.hasUniqChars("sddf"));
		
		Assert.assertEquals(true, UniqChars.hasUniqCharsBit("sdf"));
		Assert.assertEquals(false, UniqChars.hasUniqCharsBit("sddf"));
	}
	@Test
	public void unicodeTest() {
		Assert.assertEquals(true, UniqChars.hasUniqChars("⟅⟆"));
		Assert.assertEquals(false, UniqChars.hasUniqChars("⟚⟚bt"));
	}
}
