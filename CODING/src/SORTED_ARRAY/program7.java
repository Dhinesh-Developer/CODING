package SORTED_ARRAY;

import java.util.Scanner;

public class program7 {
	private static void LargestRepeatingElement(int[] ar) {
		for(int i=ar.length-2;i>=0;i--) {
			if(ar[i] == ar[i+1]) {
				System.out.println(ar[i]);
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
		LargestRepeatingElement(ar);
	}

}
