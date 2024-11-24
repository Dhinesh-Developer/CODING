package ARRAY;

import java.util.Scanner;
// Given an array of n integers.write a program to print the second largest element present in the array.
public class program17 {
	public static int secondSmallestElement(int[] ar) {
		int largest  = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > largest) {
				largest = ar[i];
			}
		}
		
		int sLargest = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > sLargest && ar[i] != largest) {
				sLargest = ar[i];
			}
		}
		return sLargest;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar= new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int sLar = secondSmallestElement(ar);
		System.out.println("The second Largest Element is "+sLar);
		
	}
/*
 * 5
1
2
3
4
5
The second Largest Element is 4
 */
}
