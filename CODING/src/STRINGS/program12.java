package STRINGS;

import java.util.Arrays;

// Valid anagram
/*
 * s1 = "car" s2 = "rac"  orders of character is not same ,but it is alo anagram
 */
public class program12 {
	private static boolean isAnagram(String s1, String s2) {
		if(s1.length()!= s2.length()) return false;

		char ar1[] = s1.toCharArray();
		char ar2[] = s2.toCharArray();
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		return Arrays.equals(ar1, ar2);
	}
	public static void main(String[] args) {
		String s1 = "car";
		String s2 = "rac";
		boolean res = isAnagram(s1,s2);
		System.out.println(res);
	}
//true
}
