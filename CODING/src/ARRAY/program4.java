package ARRAY;

import java.util.Scanner;

public class program4 {
	public static void printFromMidValue(int[] ar) {
		for(int i=0;i<ar.length/2;i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		printFromMidValue(ar);
	}

}
