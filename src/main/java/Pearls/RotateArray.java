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

	public T[] juggleLeft(T arr[], int numPositions) {
		T t;
		int j, k;
		for (int i = 0; i < gcd(numPositions, arr.length); i++) {
			t = arr[i];
			j = i;
			while (true) {
				k = j + numPositions;
				if (k >= arr.length)
					k -= arr.length;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = t;
		}
		return arr;
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}