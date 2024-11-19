package LOOP;

import java.util.Scanner;
// write a program to print all factor n = 10  output = 1 2 5 10.
public class program8 {
	public static void printAllFactorsOfN(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printAllFactorsOfN(n);
	}

}
