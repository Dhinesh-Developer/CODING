package SUBSTRING;

import java.util.Scanner;
 // given a two string s1 and s2 . write a program to check whether string s2 is present in the string s1.
public class program3 {
	private static String findSubString(String s1,String s2) {
		int size= s2.length();
		for(int i=0;i<s1.length()-size;i++) {
			String t = "";
			for(int j=i;j<size+i;j++) {
				t = t+s1.charAt(j);
			}
			if(t.equals(s2)) {
				return "yes";
			}
		}
		return "no";
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String res = findSubString(s1,s2);
		System.out.println("element is found: "+res);
	}

}
