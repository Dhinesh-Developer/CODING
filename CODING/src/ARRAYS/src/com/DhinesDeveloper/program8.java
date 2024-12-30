package com.DhinesDeveloper;
// find the second smallest. O(n)
public class program8 {
	private static int secondSmallest(int[] ar) {
		int s = Integer.MAX_VALUE;
		int sl = Integer.MAX_VALUE;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < s) {
				s = ar[i];
			}
			if(ar[i] < sl && ar[i] != s) {
				sl = ar[i];
			}
		}
		return sl;
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6};
		int res = secondSmallest(ar);
		System.out.println(res);
	}
// 2
}
