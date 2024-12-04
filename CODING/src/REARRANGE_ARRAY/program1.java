package REARRANGE_ARRAY;

import java.util.Scanner;
/*
 * given an array of n size with positive integers and -1;write a program to reararnge
 * the array such that all -1 are present at the starting of the array.
 * output = -1 -1 -1 -1 -13 -14 5 3 8 2 
 */
public class program1 {
	private static void rearrangeArray(int[] ar) {
		int i = ar.length-1;
		int j = ar.length-1;
		while(i>=0) {
			if(ar[i] == -1) {
				i--;
			}else {
				ar[j] = ar[i];
				i--;
				j--;
			}
		}
		while(j>=0) {
			ar[j] = -1;
			j--;
		}
		for(int k=0;k<ar.length;k++) {
			System.out.print(ar[k]+" ");
		}
	}
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] ar = new int[n];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = in.nextInt();
//		}
		
		int[] ar = {-1,-13,-14,-1,5,3,-1,8,2,-1};
		rearrangeArray(ar);
	}

}
