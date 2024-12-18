package IF;

import java.util.Scanner;
 //check if the n is +,-,0
public class program14 {
	static void greaterSmallerOrZero(int n) {
		if(n>0) {
			System.out.println("positive");
		}else if(n==0) {
			System.out.println("zero");
		}else {
			System.out.println("Negative");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		greaterSmallerOrZero(n);
	}

}
