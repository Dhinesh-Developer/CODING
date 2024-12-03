package SORTED_ARRAY;
import java.util.Scanner;

// Given a sorted of n integers .write a program to print the occurence of each element present in the array.
//input = 8   2 2 2 3 4 4 4 23   output = 2-3  3-1  4-3  23-1
public class program2 {
	private static void PrintOccurence(int[] ar) {
		int count = 1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				System.out.println(ar[i]+"-"+count);
				count=1;
			}
			
		}
		System.out.println(ar[ar.length-1]+"-"+count);
	}
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		PrintOccurence(ar);
	}

}