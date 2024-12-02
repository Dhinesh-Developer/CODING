package MERGE_ARRAY;
// Given an array of n integer and an integer value. write a program to print all the sub array of given length size
import java.util.Scanner;

public class program2 {
	static void printSubarray(int[] ar,int k) {
		for(int i=0;i<ar.length-k;i++) {
			for(int j=i;j<i+k;j++) {
				System.out.print(ar[j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int k = in.nextInt();
		printSubarray(ar,k);
	}

}
