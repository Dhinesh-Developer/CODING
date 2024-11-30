package MULTIPLE_ARRAY;

import java.util.Scanner;

public class program3 {
	private static void mergeInReverseOrder(int[] ar1,int[] ar2) {
		int i=0;
		int k=0;
		int[] res = new int[ar1.length+ar2.length];
		
			for(i=ar2.length;i>0;i--) {
				res[k] = ar2[i];
			}
			for(i=ar1.length;i>0;i--) {
				res[ar1.length+i] = ar2[i];
			}
			
			for(i=0;i<res.length;i++) {
				System.out.print(res[i]+" ");
			}
		
	}
	public static void main(String[] args) { 
		
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int[] ar1 = new int[n1];
		for(int i=0;i<ar1.length;i++) {
			ar1[i] = in.nextInt();
		}
		int n2 = in.nextInt();
		int[] ar2 = new int[n2];
		for(int i=0;i<ar2.length;i++) {
			ar2[i] = in.nextInt();
		}
		mergeInReverseOrder(ar1,ar2);
		
	}

}
