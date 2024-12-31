package com.DhinesDeveloper;
//Find the second largest element in the array.
import java.util.Arrays;

public class program23 {
	private static void secondLargestElement(int[] ar) {
		Arrays.sort(ar);
		System.out.println(ar.length-1); // 6.
	}
	
	private static int secondLarElement(int[] ar) {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > largest) {
				secondLargest = largest;
				largest = ar[i];
			}
			if(ar[i] > secondLargest && ar[i] != largest) {
				secondLargest = ar[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7};
		int[] ar1= {-1,7,1,34,18};
		secondLargestElement(ar);
		int res = secondLarElement(ar1);
		System.out.println(res);
	}
	// 6
	// 18
}
