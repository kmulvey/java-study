package Bits;

import org.junit.Assert;
import org.junit.Test;

import Bits.LetterCase.Case;


public class LetterCaseTest {

	@Test
	public void testLower(){
		Assert.assertEquals(Case.LOWER, LetterCase.getCase('a'));
		Assert.assertEquals(Case.UPPER, LetterCase.getCase('A'));
		Assert.assertEquals(Case.LOWER, LetterCase.getCase('b'));
		Assert.assertEquals(Case.UPPER, LetterCase.getCase('B'));
	}
}
