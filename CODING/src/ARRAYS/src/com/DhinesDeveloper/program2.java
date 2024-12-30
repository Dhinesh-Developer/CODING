package com.DhinesDeveloper;
/*
 * find the pair whose sum is equal to k.
 */
public class program2 {
	private static void findPair(int[] ar,int sum) {
		int low=0;
		int high  =ar.length-1;
		while(low < high) {
			if(ar[low] + ar[high] > sum) {
				high--;
			}else if(ar[low]+ ar[high] < sum) { 
				low++;
			}else if(ar[low]+ar[high] == sum) {
				System.out.println(ar[low] +" "+ar[high]);
				low++;
				high--;
			}
		}
	}
	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5,6,7};
		int sum = 9;
		findPair(ar,sum);
	}
/*
 * output
2 7
3 6
4 5
 */
}
