package SET;

import java.util.HashSet;
import java.util.Scanner;
 // write a program to remove the duplicates.
public class program4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = in.nextInt();
		}
		
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer x : ar) {
			set.add(x);
		}
		
		for(Integer x : set) {
			System.out.println(x);
		}
	}

}
