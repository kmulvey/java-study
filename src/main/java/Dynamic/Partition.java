package Dynamic;

import java.util.ArrayList;

import Sorting.Sorts;

public class Partition {
	public ArrayList<ArrayList<Integer>> greedy(int[] values, int K){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		// sort
		values = Sorts.mergeSort(values, 0, values.length);
		
		// put K elements in different sets
		int valIterator;
		for(valIterator=0; valIterator<K; valIterator++){
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp.add(values[valIterator]);
			result.add(tmp);
		}
		
		// put n-k into sets with least sum
		for(; valIterator<values.length; valIterator++){
			for(int partitionIterator=0; partitionIterator<K; partitionIterator++){
				int sum = 0;
				for(int partitionValuesIterator=0; partitionValuesIterator<result.get(partitionIterator).size(); partitionValuesIterator++){
					
				}
			}
		}
		return result;
		
	}
}
