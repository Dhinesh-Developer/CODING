package ARRAY;

import java.util.Scanner;
 //combination of 4 digits out of 5 digits ,print the max and min value.
public class program15 {
	public static int sumOfArray(int[] ar) {
		int sum=  0;
		for(int i=0;i<ar.length;i++) {
			sum = sum+ar[i];
		}
		return sum;
	}
	public static int largestElement(int[] ar) {
		int max = ar[0];
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > max) {
				max = ar[i];
			}
		}
		return max;
	}
	
	public static int smallestElement(int[] ar) {
		int min = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < min) {
				min = ar[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int sum  =sumOfArray(ar);
		int min = smallestElement(ar);
		int max=  largestElement(ar);
		System.out.println(sum - min);
		System.out.println(sum + max);
	}

}
