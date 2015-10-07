package Sorting;

public class Sorts {

	public static int[] insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i;
			int toInsert = arr[i];
			while ((j > 0) && (arr[j - 1] > toInsert)) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = toInsert;
		}
		return arr;
	}
	
	public static int[] mergeSort(int[] arr) {
		
		return arr;
	}
}
