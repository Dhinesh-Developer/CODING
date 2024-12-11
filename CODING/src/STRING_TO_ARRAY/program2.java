package STRING_TO_ARRAY;

import java.util.Scanner;

public class program2 {
	private static String reverse(String s) {
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t = t+s.charAt(i);
		}
		return t;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String res=reverse(s);
		System.out.println(res);
	}

}
