package SORTED_ARRAY;
import java.util.Scanner;
// Given an sorted array of n.write a program to print all the elements of the array without repeating.
// input=  8  2 2 2 3 4 4 4 23   output = 2 3 4 23
public class program3 {
	private static void printElementsButNotRepeated(int[] ar) {
		int count = 1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				System.out.println(ar[i]);
				count=1;
			}
		}
		System.out.println(ar[ar.length-1]);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		printElementsButNotRepeated(ar);
	}

}
