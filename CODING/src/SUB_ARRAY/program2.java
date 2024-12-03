package SUB_ARRAY;

import java.util.Scanner;

public class program2 {
	private static void printSubarrayEqualToK(int[] ar,int s,int k) {
		for(int i=0;i<ar.length-s;i++) {
			int sum=0;
			for(int j=i;j<i+s;j++) {
				sum = sum+ar[j];
			}
			if(sum==k) {
				for(int j=i;j<i+s;j++) {
					System.out.print(ar[j]+" ");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
		int s = in.nextInt();
		int k = in.nextInt();
		printSubarrayEqualToK(ar,s,k);
	}

}
