package com.DhinesDeveloper;
// Find the minimum element in a sorted array and rotated array.
public class program13 {
	public static void minInRoatedSortedArray(int[] ar) {
		int min = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < min) min = ar[i];
		}
		System.out.println(min);
	}
	public static void main(String[] args) {
		int[] ar = {5,6,1,2,3,4};
		minInRoatedSortedArray(ar);
	}
// 1
}
