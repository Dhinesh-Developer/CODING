package ARRAY;

import java.util.Scanner;
// Write a program to print the index of k in the array.
public class program14 {
	static int indexOfK(int[] ar,int k) {
		int index = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == k) {
				index = i ;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		int target = indexOfK(ar, k);
		System.out.println("K is present in the index of "+target);
	}

}
