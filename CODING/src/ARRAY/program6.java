package ARRAY;

import java.util.Scanner;

public class program6 {
	public static void printOddNumbers(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			if(i%2!=0) {
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
		printOddNumbers(ar);

	}

}
