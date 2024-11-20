package LOOP;

import java.util.Scanner;
// write a program to print the  number of factors of n.
public class program9 {
	public static int  numberOfFactors(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = numberOfFactors(n);
		System.out.println("Count is "+res);
		
	}

}
