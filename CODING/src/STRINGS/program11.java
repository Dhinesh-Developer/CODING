package STRINGS;

import java.util.HashSet;

// given a String, find the length of the longest subString.
public class program11 {
	private static int lengthOfTheLongestSubString(String s) {
		int maxCount = 0;
		int i = 0;
		int j = 0;
		int len = s.length();
		HashSet<Character> set = new HashSet<>();
		
		while(i<len && j <len) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				maxCount = Math.max(maxCount, j-i);
			}else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxCount;
	}
	public static void main(String[] args) {
		String s = "abcabcbb"; //test case1
		String s2 = "bbbbb";
		int res = lengthOfTheLongestSubString(s);
		System.out.println(res);
	}
//3
}
