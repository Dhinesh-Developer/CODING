package LOOP_PROGRAM;

import java.util.Scanner;
// write a program to print  lcm of n and m  input = 12,18   output = 18.

public class program3 {
	public static int highestCommonFactor(int n,int m) {
		int min = n<m?m:n;
		for(int i=min;i>=1;i--) {
			if(n%i==0 && m%i==0) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int hcf = highestCommonFactor(n,m);
		int lcm = n*m/hcf;
		System.out.println("Lcm is: "+lcm);
	}

}
