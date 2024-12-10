package SUBSTRING;

import java.util.Scanner;

public class program5 {
	private static int countWords(String s) {
		int cnt = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i)!=' ') {
				cnt++;
			}
		}
		return s.charAt(0)==' '?cnt:cnt+1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int res = countWords(s);
		System.out.println(res);
	}

}
