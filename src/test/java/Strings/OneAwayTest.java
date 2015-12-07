package Strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Strings.OneAway;

public class OneAwayTest {
	@Test
	public void addOne() {
		OneAway oa = new OneAway();
		assertEquals(true, oa.compare("pale", "ple"));
		assertEquals(true, oa.compare("pales", "pale"));
		assertEquals(true, oa.compare("pale", "bale"));
		assertEquals(false, oa.compare("pale", "bake"));
		assertEquals(true, oa.compare("pale", "pzle"));
	}
}