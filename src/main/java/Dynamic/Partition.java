package Dynamic;

import java.util.ArrayList;

import Sorting.Sorts;

public class Partition {
	public ArrayList<ArrayList<Integer>> greedy(int[] values, int K) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		// sort
		values = Sorts.mergeSort(values, 0, values.length);

		// put K elements in different sets
		int valIterator;
		for (valIterator = 0; valIterator < K; valIterator++) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(values[valIterator]);
			result.add(tmp);
		}

		// put n-k into sets with least sum
		for (; valIterator < values.length; valIterator++) {
			for (int partitionIterator = 0; partitionIterator < K; partitionIterator++) {
				int sum = 0;
				for (int partitionValuesIterator = 0; partitionValuesIterator < result.get(partitionIterator)
						.size(); partitionValuesIterator++) {

				}
			}
		}
		return result;

	}

	public static int sum(int[] x, int begin, int end) {
		int sum = 0;
		for (int i = begin; i < end; i++)
			sum += x[i];
		return sum;
	}
	
	private int minimumPossibilityLength(int[] books, int n, int k){
		if(k==1) return sum(books, 0, n);
		if(n==1) return books[0];
		int min = Integer.MAX_VALUE;
		for(int i =0; i<n; i++){
			int a = minimumPossibilityLength(books, i+1, k-1);
			int b = sum(books, i+1, n);
			min = Math.min(min, Math.max(a, b));
		}
		return min;
	}
	
	public int[] solve(int[] books, int k){
		assert k>0;
		assert books.length >=k;
		
		int min = minimumPossibilityLength(books, books.length, k);
		int[] dividers = new int[k-1];
		int sum = 0, d=0;
		
		for(int i=0; i<books.length; i++){
			if(sum + books[i]  > min){
				dividers[d++] = i;
				sum = books[i];
			} else{
				sum += books[i];
			}
		}
		assert d == dividers.length;
		return dividers;
	}
}
