package ARRAY;

import java.util.Scanner;
// REverse the array
public class program2 {
	public static void printArrayReverse(int[] ar,int size) {
		for(int i=ar.length-1;i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<n;i++) {
			ar[i] = in.nextInt();
		}
		printArrayReverse(ar,n);
	}

}
