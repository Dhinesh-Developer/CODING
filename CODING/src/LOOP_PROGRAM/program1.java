package LOOP_PROGRAM;
import java.util.Scanner;

// Write a program to print all the common factors of both n and m.  input = 12 18   output = 1,2,3,6
public class program1 {
	public static void commonFactors(int n,int m) {
		int min = n<m?n:m;
		for(int i=1;i<=min;i++) {
			if(n%i==0 && m%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		commonFactors(n,m);
	}

}
