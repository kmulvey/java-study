package Bits;

import java.util.Arrays;

public class Telephone {
	public static void main(String[] args) {
		int max = 1000000; // 0,000,000 - 9,999,999 646 0817
    boolean[] arr = new boolean[max];		
    Arrays.fill(arr, false);
    int j=0;
    
		for(int i=0; i<arr.length;i++){
			if(i != j) {
				arr[i]= true;
			}
			else {
				j=j+10;
			}
		
		}
	}
}
