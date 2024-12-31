package com.DhinesDeveloper;
// Given an array,rotate the array to the right by k steps, where k is non-negative.
public class program27 {	
	private static void rotateElementsByKTimes(int[] ar,int k) {
		int j = 0;
		while(k>0) {
			int temp = ar[ar.length-1];
			for(j=ar.length-1;j>0;j--) ar[j] = ar[j-1];
			ar[j] = temp;
			k--;
		}
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,8,9,10};
		int k = 3;
		rotateElementsByKTimes(ar,k);
		for(int x: ar) {
			System.out.print(x+" ");
		}
	}
//8 9 10 1 2 3 
}
