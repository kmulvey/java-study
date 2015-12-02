package Strings;

import org.junit.Assert;
import org.junit.Test;

public class PermutationTest {
	@Test
	public void one() {
		Assert.assertEquals(true, Permutation.isPerm("asdf", "fdsa", true));
		Assert.assertEquals(true, Permutation.isPerm("asssdf", "sfdsas", true));
		Assert.assertEquals(false, Permutation.isPerm("fasdf", "fdsa", true));
		Assert.assertEquals(false, Permutation.isPerm("God", "dog", true));
		Assert.assertEquals(true, Permutation.isPerm("God", "dog", false));
		Assert.assertEquals(true, Permutation.isPerm("dogs and cats", "cats and dogs", false));
		Assert.assertEquals(true, Permutation.isPerm("as1ssdf", "sfdsas1", true));
	}
	
	@Test
	public void palindrome() {
		Assert.assertEquals(true, Permutation.isPalindromePerm("racecar"));
		Assert.assertEquals(true, Permutation.isPalindromePerm("carrace"));
		Assert.assertEquals(false, Permutation.isPalindromePerm("dogs and cats"));
		Assert.assertEquals(false, Permutation.isPalindromePerm("aaasdddw"));
	}
}
