package LOOP_PROGRAM;

import java.util.Scanner;
// Write a program to find the GCD of two numbers. input = 12  18   output = 6.
public class program2 {
	public static void GCD(int n,int m) {
		int min = n<m?n:m;
		for(int i=min;i>=1;i--) {
			if(n%i==0 && m%i==0) {
				System.out.print(i+" ");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		GCD(n,m);
	}

}
