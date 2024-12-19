package ARRAY_CODE;

import java.util.Scanner;
// write a program to find the second largest Element in the array.
public class program1 {
	public static void secondLargest(int[] ar) {
		int l = ar[0];
		int sl = -1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > l) {
				l = ar[i];
			}
		}
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > sl && ar[i] != l) {
				sl = ar[i];
			}
		}
		System.out.println(sl);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
		secondLargest(ar);
	}

}
