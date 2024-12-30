package com.DhinesDeveloper;
//sub array sum   O(n)   Kadene algorithm
public class program17 {
	private static void findMAxSubArraySum(int[] ar) {
		int maxSum = ar[0];
		int sum = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(sum < 0 ) sum=ar[i];
			else sum = sum+ar[i];
		}
		maxSum = Math.max(maxSum, sum);
		System.out.println(maxSum);
	}
	public static void main(String[] args) {
		int[] ar = {1,2,-5,4,3,8,5};
		findMAxSubArraySum(ar);
	}
// 20
}
