package com.DhinesDeveloper;
// insertion sort
public class program7 {
	private static void insertionSort(int[] ar) {
		int temp;
		int j;
		for(int i=1;i<ar.length;i++) {
			temp = ar[i];
			j=i-1;

			while(j>=0 && temp < ar[j]) {
				ar[j+1] = ar[j];
				j = j-1;
			}
			ar[j+1] = temp;

		}
	}
	public static void main(String[] args) {
		int[] ar = {5,1,3,6,3,4,5};
		insertionSort(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
//1 3 3 4 5 5 6 
}
