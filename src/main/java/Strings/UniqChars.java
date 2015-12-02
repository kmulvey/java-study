package Strings;

import java.util.BitSet;
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

	// assumes ascii
	public static boolean hasUniqCharsBit(String input) {
		BitSet map = new BitSet(128);
		
		for (int i = 0; i < input.length(); i++) {
			if (map.get((int) input.charAt(i))) return false;
			map.set((int) input.charAt(i));
		}
		return true;
	}
}
