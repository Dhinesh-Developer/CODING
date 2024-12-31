package STRINGS;

import java.util.HashMap;

//Java program to find the frequency of each character of a string.
public class program4 {
	private static void frequency(String s) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			Character ch =s.charAt(i);
			if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
			else map.put(ch, 1);
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		String s = "programming";
		frequency(s);
	}
// {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}
}
