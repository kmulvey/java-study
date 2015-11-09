package Strings;

public class Compare {
	private final int MATCH = 0;
	private final int INSERT = 1;
	private final int DELETE = 2;

	public Compare() {
	};

	public int recurseEditDist(String s, String t, int sEnd, int tEnd) {
		int k;
		int[] opt = new int[3];
		int lowestCost;

		if (sEnd == 0)
			return (tEnd * 1);
		if (tEnd == 0)
			return (sEnd * 1);

		opt[MATCH] = recurseEditDist(s, t, sEnd - 1, tEnd - 1) + match(s.charAt(sEnd), t.charAt(tEnd));
		opt[INSERT] = recurseEditDist(s, t, sEnd, tEnd - 1) + 1;
		opt[DELETE] = recurseEditDist(s, t, sEnd - 1, tEnd) + 1;

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
