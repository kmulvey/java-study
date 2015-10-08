package Math;

import java.util.ArrayList;

public class Primes {
	private static boolean[] calcPrimes(int limit) {
		boolean[] primes = new boolean[limit + 1];
		primes[2] = true;
		primes[3] = true;
		int root = (int) Math.ceil(Math.sqrt(limit));

		for (int i = 1; i < root; i++) {
			for (int j = 1; j < root; j++) {
				int n = 4 * i * i + j * j;
				if (n <= limit && (n % 12 == 1 || n % 12 == 5))
					primes[n] = !primes[n];

				n = 3 * i * i + j * j;
				if (n <= limit && n % 12 == 7)
					primes[n] = !primes[n];

				n = 3 * i * i + j * j;
				if ((i > j) && (n <= limit) && (n % 12 == 11))
					primes[n] = !primes[n];
			}
		}

		for (int i = 1; i <= root; i++) {
			if (primes[i])
				for (int j = i * i; j < root; j += i * i)
					primes[j] = false;
		}

		return primes;
	}
	
	public static ArrayList<Integer> getPrimes(int n){
		boolean[] primes = calcPrimes(n);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i =2; i<primes.length; i++){
			if(primes[i]) result.add(i);
		}
		return result;
	}
}
