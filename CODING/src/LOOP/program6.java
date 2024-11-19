package LOOP;

import java.util.Scanner;
// Print the Tables.
public class program6 {
	public static void printNTables(int n) {
		for(int i=1;i<=10;i++) {
			System.out.print(n+"x"+i+"="+n*i+"   ");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		printNTables(n);
	}

}
