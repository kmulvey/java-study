package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

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
	
	public static boolean isPalindromePerm(String input){
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for(int i=0; i<input.length(); i++){
			int curr = countMap.getOrDefault(input.charAt(i), 0);
			countMap.put(input.charAt(i), curr+1);
		}
		
		int numOdd =0;
		Iterator<Entry<Character, Integer>> it = countMap.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Character, Integer> pair = (Map.Entry<Character, Integer>)it.next();
			if(pair.getValue()%2 !=0) numOdd++;
			if(numOdd>1) return false;
		}
		return true;
	}
}