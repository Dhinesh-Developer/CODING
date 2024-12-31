package com.DhinesDeveloper;
// Reverse an array in Groups of given size
public class program29 {
	private static void reverseArrayOfSizeK(int[] ar,int k) {
		int len = ar.length;
		for(int i=0;i<len;i=i+k) {
			int start = i;
			int end = Math.min(i+k-1, len-1);
			while(start <= end) {
				int temp=ar[start];
				ar[start] = ar[end];
				ar[end] = temp;
				start++;
				end--;
			}
		}
	}
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7,8};
		int k = 5;
		reverseArrayOfSizeK(ar,k);
		for(int x:ar) System.out.print(x+" ");
	}
//5 4 3 2 1 8 7 6 
}
