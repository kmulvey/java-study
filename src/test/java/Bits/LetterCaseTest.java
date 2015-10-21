package Bits;

import org.junit.Assert;
import org.junit.Test;

import Bits.LetterCase.Case;


public class LetterCaseTest {

	@Test
	public void testLower(){
		Assert.assertEquals(Case.LOWER, LetterCase.isLowercase('a'));
		Assert.assertEquals(Case.UPPER, LetterCase.isLowercase('A'));
		Assert.assertEquals(Case.LOWER, LetterCase.isLowercase('b'));
		Assert.assertEquals(Case.UPPER, LetterCase.isLowercase('B'));
	}
}
