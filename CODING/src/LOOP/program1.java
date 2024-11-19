package LOOP;

import java.util.Scanner;
// Print from N
public class program1 {
	public static void printFromN(int n) {
		for(int i=0;i<n;i++) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printFromN(n);
	}

}
