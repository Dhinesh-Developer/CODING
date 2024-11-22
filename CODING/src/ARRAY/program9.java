package ARRAY;

import java.util.Scanner;

public class program9 {
	public static int sumOfElements(int[] ar) {
		int sum = 0;
		for(int i=0;i<ar.length;i++) {
			sum=  sum+ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int res = sumOfElements(ar);
		System.out.println("Sum of ELements: "+res);

	}

}
