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
}
