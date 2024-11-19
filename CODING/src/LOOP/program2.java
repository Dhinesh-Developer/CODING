package LOOP;

import java.util.Scanner;
// Print in reverse
public class program2 {
	public static void printInReverseOfN(int n) {
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printInReverseOfN(n);
	}

}
