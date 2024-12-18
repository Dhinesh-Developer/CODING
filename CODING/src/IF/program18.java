package IF;

import java.util.Scanner;
 // check if the number is perfect square.
public class program18 {
	private static void perfectSquare(int n) {
		int sqrt = (int) Math.sqrt(n);
		System.out.println(sqrt*sqrt == n);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		perfectSquare(n);
	}

}
