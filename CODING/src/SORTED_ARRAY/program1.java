package SORTED_ARRAY;
 // write a program to print all the pairs present in the array whose sum is equal to k.
// input = 5   3 4 1 2 5   6    output = 4 2   1 5
import java.util.Scanner;

public class program1 {
	public static void printSumEqualToK(int[] ar,int k) {
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]+ar[j] == k || ar[j]-ar[i] == k) {
					System.out.print(ar[i] +" "+ar[j]);
				}
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
		int k = in.nextInt();
		printSumEqualToK(ar,k);
	}

}
