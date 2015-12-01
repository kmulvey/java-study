package Pearls;

public class MaxSubvector {

	public static int max(int[] arr) {
		int maxSoFar = 0; // i-1 sum
		int maxNow = 0; // i sum
		for (int i = 0; i < arr.length; i++) {
			maxNow = max(maxNow + arr[i], 0); // dont go backwards
			maxSoFar = max(maxSoFar, maxNow);
		}
		return maxSoFar;
	}

	private static int max(int x, int y) {
		return x > y ? x : y;
	}
}
 