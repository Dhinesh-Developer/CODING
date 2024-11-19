package LOOP;

import java.util.Scanner;
// Print All The Two Digit Numbers.
public class program7 {
	static void printAllTwoDigitNumber(int n) {
		for(int i=10;i<n;i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printAllTwoDigitNumber(n);
	}

}
