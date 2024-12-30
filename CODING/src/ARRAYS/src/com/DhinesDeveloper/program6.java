package com.DhinesDeveloper;

import java.util.Arrays;

// remove a duplicates elements from the unsorted array. O(n log n).
public class program6 {
	private static void removeDuplicates(int[] ar) {
		int n = ar.length;
		Arrays.sort(ar);
		int j = 0;
		for(int i=0;i<n-1;i++) {
			if(ar[i]!= ar[i+1]) ar[j++] = ar[i];
		} 
		ar[j++] = ar[n-1];
		
		for(int i=0;i<j;i++) {
			System.out.print(ar[i]+" ");
		}
	} 
	public static void main(String[] args) { 
		int[] ar = {5,1,2,6,4,4,5};
		removeDuplicates(ar);
	}
//1 2 4 5 6  
}
