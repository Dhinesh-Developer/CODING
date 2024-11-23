package ARRAY;

import java.util.Scanner;
// Write s program to print the largest Element present in the array.
public class program11 {
	public static int largestElement(int[] ar) {
		int max = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i]> max) {
				max = ar[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		Scanner in=  new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int largest = largestElement(ar);
		System.out.println("Largest Element in the Array is: "+largest);
	}

}
