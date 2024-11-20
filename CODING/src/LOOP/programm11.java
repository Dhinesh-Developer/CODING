package LOOP;

import java.util.Scanner;
// write a program to print the common multiples of a and b till n.
public class programm11 {
	public static void commonMultiples(int n,int a,int b) {
		for(int i=1;i<=n;i++) {
			if(i%a==0 && i%b==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		commonMultiples(n,a,b);
	}

}
