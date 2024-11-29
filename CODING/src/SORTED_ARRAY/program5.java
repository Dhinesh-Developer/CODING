package SORTED_ARRAY;
import java.util.Scanner;
// Given a sorted array of n integers.write a program to print all the unique elements present in the array.
// input = 8  2 2 2 3 4 4 4 23   output = 3  23
public class program5 {
	private static void uniqueELements(int[] ar) {
		int count = 1;
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i] == ar[i+1]) {
				count++;
			}else {
				if(count==1) {
					System.out.println(ar[i]);
				}
				count = 1;
			}
		}
		if(count ==1) {
			System.out.println(ar[ar.length-1]);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		uniqueELements(ar);
		
	}

}
