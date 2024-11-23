package ARRAY;

import java.util.Scanner;
// Write a program to print the index of the largest Element in the array.
public class program12 {
	public static int largestElementIndex(int[] ar) {
		int max = ar[0];
		int index = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > max) {
				max = ar[i];
				index = i;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int maxIndex = largestElementIndex(ar);
		System.out.println("Largest ELement array index is: "+maxIndex);
	}

}
