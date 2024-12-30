package com.DhinesDeveloper;
// find maximum diff between two elements such that larger numbers appears after the smaller number.
public class program12 {
	private static void maxDiff(int[] ar) {
		int maxDiff = ar[1]-ar[0];
		int min = ar[0];
		for(int i=1;i<ar.length;i++) {
			if((ar[i] - min) > maxDiff) maxDiff = ar[i]-min;
			if(ar[i] < min) min = ar[i];
		}
		System.out.println(maxDiff);
	}
	public static void main(String[] args) {
		int[] ar = {2,5,15,6,4};
		maxDiff(ar);
	}
//13 o(n)
}
