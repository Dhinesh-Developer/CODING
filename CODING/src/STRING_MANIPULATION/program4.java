package STRING_MANIPULATION;

import java.util.Scanner;

public class program4 {
	private static void convertToLowerCase(String s) {
		String t = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			t = t+(char)(c+32);
		}
		System.out.println(t);
	}
	private static void convertToUpperCase(String s1) {
		String t = "";
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			t = t+(char)(c-32);
		}
		System.out.println(t);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1 = in.nextLine();
		convertToLowerCase(s);
		convertToUpperCase(s1);
	}

}
