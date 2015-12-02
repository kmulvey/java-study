package Strings;

import java.util.HashMap;

public class UniqChars {
	public static boolean hasUniqChars(String input) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (map.containsKey(input.charAt(i))) return false;
			map.put(input.charAt(i), 1);
		}
		return true;
	}

//	public static boolean hasUniqCharsBit(String input) {
//		boolean[] alpha = new boolean[26];
//		
//		for (int i = 0; i < input.length(); i++) {
//			if (map.containsKey(input.charAt(i))) return false;
//			map.put(input.charAt(i), 1);
//		}
//		return true;
//	}
}
