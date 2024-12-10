package SUBSTRING;

import java.util.Scanner;
// print all the sub string.
public class program4 {
	private static void printAllFindSubString(String s) {
		for(int size=1;size<=s.length();size++) {
			for(int i=0;i<=s.length()-size;i++) {
				String t = "";
				for(int j=0;j<size+i;j++) {
					t = t+s.charAt(j);
				}
				System.out.println(t);
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		printAllFindSubString(s);
	}

}
