package MAP;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
 /* count the occurrence of each character in the string.
  * Mississippi
{m=1, i=4, s=4, p=1}
  */
public class program3 {
	private static void printOccurence(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(map.containsKey(ch)) {
				int c = map.get(ch);
				map.put(ch, c+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		printOccurence(s);
	}

}
