package ARRAY;

import java.util.Scanner;

public class program8 {
	public static void printEvenElements(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				System.out.print(ar[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		printEvenElements(ar);
	}

}
