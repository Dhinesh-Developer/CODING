package ARRAY;

import java.util.Scanner;
// Print the array
public class program1 {
	public static void printArray(int[] ar,int size) {
		for(int i=0;i<size;i++) {
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
		printArray(ar,n);
	}

}
