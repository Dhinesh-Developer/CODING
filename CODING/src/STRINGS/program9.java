package STRINGS;

import java.util.HashMap;

// How to find first Non.repeating character in a string.
public class program9 {
	private static void firstNonRepeatingCharacter(String s) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
			else map.put(ch, 1);
		}
		for(int j=0;j<s.length();j++) {
			Character ch = s.charAt(j);
			if(map.get(ch) == 1) {
				System.out.println(ch);
				break;
			}
		}
	}
	public static void main(String[] args) {
		String s = "java";
		firstNonRepeatingCharacter(s);
	}
//j
}
