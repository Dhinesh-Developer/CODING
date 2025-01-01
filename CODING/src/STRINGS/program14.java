package STRINGS;

import java.util.HashMap;

// Find the First unique character in a String.
public class program14 {
	private static int FirstUniqueCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int j=0;j<s.length();j++) {
			char ch = s.charAt(j);
			int cnt = map.get(ch);
			if(cnt==1) {
				return j;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		String s = "character";
		int index = FirstUniqueCharacter(s);
		System.out.println(index);
	}

}
