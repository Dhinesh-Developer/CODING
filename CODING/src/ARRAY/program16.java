package ARRAY;

import java.util.Scanner;

public class program16 {
	static int product = 1;
	public static int product(int[] ar) {
		
		for(int i=1;i<=ar.length;i++) {
			int prod = product*ar[i];
		}
		return prod;
	}
	
	public static int display(int[] ar,int res) {
		int[] res = new int[ar.length];
		for(int i=0;i<res.length;i++) {
			res[i] = prod/ar[i];
		}
		return res;
		
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int prod = product(ar);
		int[] res = display(ar,prod);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i] +" ");
		}
	}

}
