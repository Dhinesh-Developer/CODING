package LOOP;

import java.util.Scanner;
// Print Even Number
public class program3 {
	public static void printEvenNumber(int n) {
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printEvenNumber(n);
	}

}
