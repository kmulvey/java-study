package Sorting;

import org.junit.Assert;
import org.junit.Test;

public class SortsTest {
  @Test
  public void insertionSort() {
  	int[] unsorted = {11,1,4,76,2,6,8,3,7,36,56,34,87,32,5};
  	int[] sorted = {1,2,3,4,5,6,7,8,11,32,34,36,56,76,87};
  	Assert.assertArrayEquals(sorted, Sorts.insertionSort(unsorted));
  }
}
