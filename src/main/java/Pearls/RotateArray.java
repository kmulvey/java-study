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
}