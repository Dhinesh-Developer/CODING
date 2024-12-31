package STRINGS;

import java.util.HashMap;

//Java program to count occurrences of each character in a String.
public class program1 {
	private static void countOccurence(String str) {
		HashMap<Character,Integer> map= new HashMap<>();
		for(Character c:str.toCharArray()) {
			if(map.containsKey(c)) map.put(c, map.get(c)+1);
			else map.put(c, 1);
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		String str = "java";
		countOccurence(str);
	}
// {a=2, v=1, j=1}
}
