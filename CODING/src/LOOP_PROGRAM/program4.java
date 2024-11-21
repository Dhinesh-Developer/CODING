package LOOP_PROGRAM;

import java.util.Scanner;

public class program4 {
	public static int countDigits(int n) {
		int count = 0;
		for(int i=0;i<n;i++) {
			n = n/10;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count = countDigits(n);
		System.out.println("Count number of digits: "+count);
	}

}
