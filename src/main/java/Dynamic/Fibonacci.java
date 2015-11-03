package Dynamic;

import java.util.Hashtable;

public class Fibonacci {
	public int slow(int n) {
		if (n == 0)
			return n;
		if (n == 1)
			return n;

		return (slow(n - 1) + slow(n - 2));
	}

	public int medium(int n, Hashtable<Integer, Integer> cache) {
		if (cache.containsKey(n))
			return cache.get(n);
		if (n == 0) {
			cache.put(n, 0);
			return n;
		}
		if (n == 1) {
			cache.put(n, 1);
			return n;
		}

		int result = medium(n - 1, cache) + medium(n - 2, cache);
		cache.put(n, result);
		return (result);
	}

	public int fast(int n) {
		int i;
		int[] cache = new int[n + 1];
		cache[0] = 0;
		cache[1] = 1;
		for (i = 2; i <= n; i++) {
			cache[i] = cache[i - 1] + cache[i - 2];
		}
		return cache[n];
	}

	public int fastest(int n) {
		if (n == 0)
			return n;

		int temp = 0, minusOne = 1, minusTwo = 0;

		for (int i = 2; i < n; i++) {
			temp = minusOne + minusTwo;
			minusTwo = minusOne;
			minusOne = temp;

		}
		return minusOne + minusTwo;
	}

}
