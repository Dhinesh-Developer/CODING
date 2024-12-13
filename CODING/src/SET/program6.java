package SET;

import java.util.Scanner;
import java.util.TreeSet;
 // remove duplicates from array.
public class program6 {
	public static void removeDuplicates(int[] ar) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			set.add(ar[i]);
		}
		for(Integer x : set) {
			System.out.print(set+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		removeDuplicates(ar);
	}

}
