package STRING;

import java.util.Scanner;
// Given an string s.write a program to check
public class program2 {
	static boolean checkPalindrome(String s) {
		String t ="";
		for(int i=s.length()-1;i>=0;i--) {
			t = t+s.charAt(i);
		}
		
		if(s.equals(t)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		boolean res = checkPalindrome(s);
		System.out.println("if is this palindrome:"+res);
	}

}
