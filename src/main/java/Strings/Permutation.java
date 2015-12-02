package Strings;

import java.util.Arrays;

public class Permutation {
	public static boolean isPerm(String one, String two, boolean caseSensitive) {
		if(one.length() != two.length()) return false;
		
		if (!caseSensitive) {
			one = one.toLowerCase();
			two = two.toLowerCase();
		}
		
		// convert to char arrays
		char[] oneArr = one.toCharArray();
		char[] twoArr = two.toCharArray();

		// sort arrays
		Arrays.sort(oneArr);
		Arrays.sort(twoArr);

		// back to strings
		String oneSorted = new String(oneArr);
		String twoSorted = new String(twoArr);

		if (oneSorted.equals(twoSorted)) return true;
		return false;
	}
}
