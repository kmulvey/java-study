package Pearls;

import java.util.Arrays;

public class Partition {

	public static boolean isEven(int[] set) {
		int sum = 0;
		for (int i = 0; i < set.length; i++) {
			sum += set[i];
		}

		if (sum % 2 != 0) return false;

		// empty boolean table of size (⌊K/2⌋ + 1) by (n + 1)
		boolean[][] table = new boolean[sum / 2 + 1][set.length + 1];

		// initialize top row (P(0,x)) of P to True
		Arrays.fill(table[0], true);

		// initialize leftmost column (P(x, 0)) of P, except for P(0, 0) to False
		for (int i = 1; i < table.length; i++) {
			table[i][0] = false;
		}

		for (int i = 1; i <= sum / 2; i++) {
			for (int j = 1; j <= set.length; j++) {
				table[i][j] = table[i][j - 1];
				if (i >= set[j - 1]) table[i][j] = table[i][j] || table[i - set[j - 1]][j - 1];
			}
		}

		return table[sum / 2][set.length];
	}
}
