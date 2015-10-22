package Pearls;

public class RotateArray<T> {
	public RotateArray() {

	}
	// Rotate array left while using minimal memory
	// 
	// Time complexity: f(n) ∈ O(n*numPositions)
	// Space complexity: f(n) ∈ O(1)
	public T[] rotate(T[] array, int numPositions) {
		for (int k = 0; k < numPositions; k++) {
			T temp = array[0];
			int i;
			for (i = 0; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array[i] = temp;
		}
		return array;
	}
}
