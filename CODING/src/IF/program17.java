package IF;

import java.util.Scanner;
 // count the how many digits are in the number.
public class program17 {
	static void countDigits(int n) {
		int cnt = 0;
		while(n>0) {
			cnt++;
			n = n/10;
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		countDigits(n);
	}

}
