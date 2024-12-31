package com.DhinesDeveloper;
// Find the maximum sum of subarray of size k.print max subarray sum.
public class program19 {
	private static int getSum(int[] ar,int k) {
		int start=0;
		int maxSum = 0;
		int sum = 0;
		for(int end = 0;end<ar.length;end++) {
			sum = sum+ar[end];
			if(end>=k-1) {
				maxSum =Math.max(sum,maxSum);
				sum = sum -ar[maxSum];
				maxSum++;
			}
		}
		return maxSum;
	}
	public static void main(String[] args) {
		int[] ar = {2,1,5,1,3,2};
		int k = 3;
		int res = getSum(ar,k);
		System.out.println(res);
	}
// 9   max sub array sum
}
