package Strings;

public class Compare {
	private final int MATCH = 0;
	private final int INSERT = 1;
	private final int DELETE = 2;

	public Compare() {
	};

	public int recurseEditDist(String s, String t, int lastSCharacter, int lastTCharacter) {
		int k;
		int[] opt = new int[3];
		int lowestCost;

		if (lastSCharacter == 0)
			return (lastTCharacter * 1);
		if (lastTCharacter == 0)
			return (lastSCharacter * 1);

		opt[MATCH] = recurseEditDist(s, t, lastSCharacter - 1, lastTCharacter - 1) + match(s.charAt(lastSCharacter), t.charAt(lastTCharacter));
		opt[INSERT] = recurseEditDist(s, t, lastSCharacter, lastTCharacter - 1) + 1;
		opt[DELETE] = recurseEditDist(s, t, lastSCharacter - 1, lastTCharacter) + 1;

		lowestCost = opt[MATCH];
		for (k = INSERT; k <= DELETE; k++) {
			if (opt[k] < lowestCost)
				lowestCost = opt[k];
		}
		return lowestCost;
	}

	private int match(char c, char d) {
		if (c == d)
			return 0;
		else
			return 1;
	}
}
