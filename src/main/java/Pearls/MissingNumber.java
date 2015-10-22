package Pearls;

import java.util.Arrays;

import Sorting.Sorts;

public class MissingNumber {
	// Given: an unsorted array of numbers (0 <= x <= 100), with some missing
	// Return: a missing number from the set
	public static int find(int[] arr) {
		arr = Sorts.insertionSort(arr);
		int last = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != last + 1)
				return last + 1;
			last = arr[i];
		}
		return -1;
	}

	// Given: an unsorted array of numbers (0 <= x <= 100), with some missing
	// Return: a missing number from the set
	// Time complexity: f(n) ∈ O(n)
	// Space complexity: f(n) ∈ O(n)
	// Method: this uses a fake bit array to do the "sorting" rather than a proper sorting
	// algorithm
	
	public static int findBit(int[] arr) {
		int[] bitArr = new int[101];
		Arrays.fill(bitArr, 0);
		for (int i = 0; i < arr.length; i++) {
			bitArr[arr[i]] = 1;
		}

		for (int i = 0; i < bitArr.length; i++) {
			if (bitArr[i] == 0)
				return i;
		}
		return -1;
	}
}
