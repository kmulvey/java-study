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

	public static int[] shellSort(int[] arr) {
		int inner, outer, tmp, interval = 1;

		while (interval <= arr.length / 3) {
			interval = interval * 3 + 1;
			while (interval > 0) {
				for (outer = interval; outer < arr.length; outer++) {
					tmp = arr[outer];
					inner = outer;
					while (inner > interval - 1 && arr[inner - interval] >= tmp) {
						arr[inner] = arr[inner - interval];
						inner -= interval;
					}
					arr[inner] = tmp;
				}
				interval = (interval - 1) / 3;
			}
		}
		return arr;
	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {
		int low = lo, high = hi;
		if (low >= high)
			return null;

		int middle = (low + high) / 2;
		mergeSort(arr, low, middle);
		mergeSort(arr, middle + 1, high);

		int endLow = middle, startHigh = middle + 1;

		while ((low <= endLow) && (startHigh <= high)) {
			if (arr[low] < arr[startHigh]) {
				low++;
			} else {
				int temp = arr[startHigh];
				for (int i = startHigh - 1; i >= low; i--) {
					arr[i + 1] = arr[i];
				}
				arr[low] = temp;
				low++;
				endLow++;
				startHigh++;
			}
		}
		return arr;
	}

}
