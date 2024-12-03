package SUB_ARRAY;

import java.util.Scanner;

public class program3 {
	private static void printAllSubarray(int[] ar,int size) {
		for(int i=0;i<=ar.length-size;i++) {
			for(int j=i;j<i+size;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
	private static void printSubArray(int[] ar) {
		for(int size=1;size<=ar.length;size++) {
			printAllSubarray(ar, size);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
		printSubArray(ar);
	}

}
