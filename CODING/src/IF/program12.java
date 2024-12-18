package IF;

import java.util.Scanner;
// check if the given is string is palindrome or not.
public class program12 {
	static String palindromeOrNot(String s) {
		String t = "";
		for(int i=0;i<s.length();i++) {
			t = t+s.charAt(i);
		}
		if(t.equals(s)) {
			return "Palindrome";
		}else {
			return "Not palindrome";
		}
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s  =in.next();
		String res = palindromeOrNot(s);
		System.out.println(res);
	}

}
