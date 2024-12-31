package STRINGS;

import java.util.HashMap;

// find the duplicates character in a String.
public class program6 {
	private static void removeDuplicates(String s) {
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(map.containsKey(ch)) map.put(ch, map.get(ch)+1);
			else map.put(ch, 1);
		}
		map.forEach((k,v) ->{
			if(v>1) System.out.println(k);
		});
	}
	public static void main(String[] args) {
		String s = "java";
		removeDuplicates(s);
	}
//a
}
