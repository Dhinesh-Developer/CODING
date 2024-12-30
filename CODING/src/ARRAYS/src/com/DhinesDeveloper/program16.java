package com.DhinesDeveloper;
// Reverse an array
public class program16 {
	//way1
	private static void reverseArray(int[] ar) {
		int temp;
		int start=0;
		int end = ar.length-1;
		while(start < end) {
			temp= ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
		for(int x:ar) System.out.print(x+" ");
	}
	// way2
	private static void reverseArray1(int[] ar) {
		for(int i=ar.length-1;i>=0;i--) System.out.print(ar[i]+" ");
	}
	public static void main(String[] args) {
		int[] ar = {1,7,8,9};
		reverseArray1(ar);
	}
//9 8 7 1 
}
