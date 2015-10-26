package Pearls;

import java.util.ArrayList;
import java.util.Arrays;

import Sorting.Sorts;

public class MissingNumber {
	// Given: an unsorted array of numbers (0 <= x <= 100), with some missing
	// Return: a missing number from the set
	public static int find(int[] input) {
		input = Sorts.insertionSort(input);
		int last = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] != last + 1)
				return last + 1;
			last = input[i];
		}
		return -1;
	}

	// Given: an unsorted array of numbers (0 <= x <= 100), with some missing
	// Return: a missing number from the set
	// Time complexity: f(n) ∈ O(n)
	// Space complexity: f(n) ∈ O(n)
	// Method: this uses a fake bit array to do the "sorting" rather than a proper
	// sorting
	// algorithm

	public static int findBit(int[] input) {
		int[] bitArr = new int[11];
		Arrays.fill(bitArr, 0);
		for (int i = 0; i < input.length; i++) {
			bitArr[input[i]] = 1;
		}

		for (int i = 0; i < bitArr.length; i++) {
			if (bitArr[i] == 0)
				return i;
		}
		return -1;
	}

	// WIP
	public static int findBinarySearch(Integer[] input, int bit) {
		ArrayList<Integer> zeroBits = new ArrayList<Integer>();
		ArrayList<Integer> oneBits = new ArrayList<Integer>();

		for (int i = 0; i < input.length; i++) {
			if (Integer.toBinaryString(input[i]).charAt(bit) == '0')
				zeroBits.add(input[i]);
			else
				oneBits.add(input[i]);
		}
		if (zeroBits.size() > oneBits.size())
			findBinarySearch(zeroBits.toArray(new Integer[zeroBits.size()]), bit + 1);
		else
			findBinarySearch(oneBits.toArray(new Integer[oneBits.size()]), bit + 1);

		return 1;

	}
}
