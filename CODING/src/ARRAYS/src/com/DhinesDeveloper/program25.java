package com.DhinesDeveloper;
//Find the length of the longest repeating subarray.
public class program25 {
	private static int findMaxLen(int[] ar) {
		if(ar.length==0) return 0;
		int len = 1;
		int maxLen = 1;
		for(int i=1;i<ar.length;i++) {
			if(ar[i-1] < ar[i]) len++;
			else len = 1;
			
			maxLen = Math.max(maxLen, len);
		}
		return maxLen;
	}
	public static void main(String[] args) {
		int[] ar = {1,2,5,0,7};
		int res= findMaxLen(ar);
		System.out.println(res);
	}
//3 
}
