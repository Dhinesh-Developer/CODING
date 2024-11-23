package ARRAY;

import java.util.Scanner;
 // Write a program to print the number of occurrence of k in the array.
public class program13 {
	public static int occurenceOfTarget(int[] ar,int target) {
		int count = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == target) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int[] ar = new int[size];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		int target = in.nextInt();
		int occurence = occurenceOfTarget(ar,target);
		System.out.println("Occurence of Target Element is "+occurence);
	}

}
