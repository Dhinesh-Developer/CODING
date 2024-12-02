package MERGE_ARRAY;
import java.util.Scanner;
// Given three arrays of integer value.write a program to merge these three array as shown in the output

public class program1 {
	public static int[] mergeArray(int[] ar1,int[] ar2,int[] ar3) {
		int[] res = new int[ar1.length+ar2.length+ar3.length];
		int i=0,k=0;
		while(k < res.length) {
			if(i<ar1.length) {
				res[k++] = ar1[i];
			}
			if(i<ar2.length) {
				res[k++] = ar2[i];
			}
			if(i<ar3.length) {
				res[k++] = ar3[i];
			}
			i++;
		}
		return res;
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
		int n3 = in.nextInt();
		int[] ar3 = new int[n3];
		for(int i=0;i<ar3.length;i++) {
			ar3[i] = in.nextInt();
		}
		
		int[] res = mergeArray(ar1,ar2,ar3);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

}
