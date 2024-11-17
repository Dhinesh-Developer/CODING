package IFELSE;

import java.util.Scanner;
//Convert Negative to Positive.
public class program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n>0?n:-n);
	}

}
