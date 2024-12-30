package com.DhinesDeveloper;
//write a program to segregate of 0's on left side and the 1's on right side of the array.
public class program5 {
	private static void segregrate(int[] ar) {
		int j=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == 0) ar[j++] = ar[i];
		}
		while(j < ar.length) ar[j++] = 1;
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		int []ar = {0,1,0,1,0,0,1,0,1,1,0};
		segregrate(ar);
		
	}
// 0 0 0 0 0 0 1 1 1 1 1 
}
