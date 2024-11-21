package LOOP_PROGRAM;

import java.util.Scanner;

public class program6 {
	static int reverseNum(int n) {
		int rev = 0;
		int last =0;
		for(int i=0;i<=n;i++) {
			last = n%10;
			rev = rev*10+last;
			n = n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int resNum = reverseNum(n);
		System.out.println("Reversed Number: "+resNum);
	}

}
