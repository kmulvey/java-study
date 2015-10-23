package Pearls;

public class RotateArray<T> {
	public RotateArray() {

	}

	// Rotate array left while using minimal memory
	// Given: an array and a number of position to shift
	// Returns: an array shifted by the number of elements specified
	// Time complexity: f(n) ∈ O(n*numPositions)
	// Space complexity: f(n) ∈ O(1)
	public T[] rotateLeft(T[] array, int numPositions) {
		if (numPositions == 0 || numPositions == array.length)
			return array;
		for (int k = 0; k < numPositions; k++) {
			T firstEle = array[0];
			int i;
			for (i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[i] = firstEle;
		}
		return array;
	}

	// Rotate array right while using minimal memory
	// Given: an array and a number of position to shift
	// Returns: an array shifted by the number of elements specified
	// Time complexity: f(n) ∈ O(n*numPositions)
	// Space complexity: f(n) ∈ O(1)
	public T[] rotateRight(T[] array, int numPositions) {
		if (numPositions == 0 || numPositions == array.length)
			return array;
		for (int k = 0; k < numPositions; k++) {
			T temp = array[array.length - 1];
			int i;
			for (i = array.length - 1; i > 0; i--) {
				array[i] = array[i - 1];
			}
			array[i] = temp;
		}
		return array;
	}

	public T[] juggleLeft(T array[], int numPositions) {
		if (numPositions == 0 || numPositions == array.length)
			return array;
		T t;
		int j, k;
		for (int i = 0; i < gcd(numPositions, array.length); i++) {
			t = array[i];
			j = i;
			while (true) {
				k = j + numPositions;
				if (k >= array.length)
					k -= array.length;
				if (k == i)
					break;
				array[j] = array[k];
				j = k;
			}
			array[j] = t;
		}
		return array;
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public T[] swap(T[] x, int a, int b, int m) {
		T t;
		while (m-- > 0) {
			t = x[a];
			x[a] = x[b];
			x[b] = t;
			a++;
			b++;
		}
		return x;
	}
}