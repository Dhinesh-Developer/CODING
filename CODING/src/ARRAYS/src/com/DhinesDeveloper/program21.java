package com.DhinesDeveloper;
//find the peak elements.
public class program21 {
	private static int findPeak(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] > ar[i+1]) return ar[i];
		}
		return ar[ar.length-1];
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,7,6};
		int peak = findPeak(ar);
		System.out.println(peak);
	}
//7 output.
}
