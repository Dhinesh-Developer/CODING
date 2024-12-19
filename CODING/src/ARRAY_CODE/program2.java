package ARRAY_CODE;

import java.util.Scanner;
 // write a program to print the factorial of a given number.
public class program2 {
	private static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		return n * factorial(n-1);
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		int[] ar = new int[n];
//		for (int i = 0; i < ar.length; i++) {
//			ar[i] = in.nextInt();
//		}
		int res = factorial(n);
		System.out.println(res);
	}

}
