package MERGE_ARRAY;

import java.util.Scanner;
// print all the sum of sub array present in the array.
public class program3 {
	private static void printSumOfSubarray(int[] ar,int k) {
		for(int i=0;i<ar.length-k;i++) {
			int sum = 0;
			for(int j=i;j<i+k;i++) {
				sum = sum+ar[j];
			}
			System.out.println(sum);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		printSumOfSubarray(ar,k);
	}

}
