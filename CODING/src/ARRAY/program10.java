package ARRAY;

import java.util.Scanner;

public class program10 {
	public static int productOfElements(int[] ar) {
		int prod = 1;
		for(int i=0;i<ar.length;i++) {
			prod = prod*ar[i];
		}
		return prod;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int res = productOfElements(ar);
		System.out.println("Products of ELements: "+res);

	}

}
