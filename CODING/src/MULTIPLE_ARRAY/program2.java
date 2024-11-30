package MULTIPLE_ARRAY;

import java.util.Scanner;

public class program2 {
	private static void mergeArray(int[] ar1,int[] ar2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] res = new int[ar1.length+ar2.length];
		while(i<ar1.length && j<ar2.length) {
			if(ar1[i] <= ar2[j]) {
				res[k] = ar1[i];
				i++;
				k++;
			}else {
				res[k] = ar2[j];
				j++;
				k++;
			}
			while(j<ar2.length) {
				res[k] = ar2[j];
				j++;
				k++;
			}
			while(i<ar1.length)
			{
				res[k]  =ar1[i];
				i++;
				k++;
			}
		}
		for( i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int[] ar1 = new int[n1];
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = in.nextInt();
		}
		int[] ar2 = new int[n2];
		for(int i=0;i<ar2.length;i++) {
			ar2[i] = in. nextInt();
		}
		
		mergeArray(ar1,ar2);
	}

}
