package SET;

import java.util.Scanner;
import java.util.TreeSet;
// program to remove dupilcates in the string.
public class program5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		TreeSet<Character> set = new TreeSet<Character>();
		String s = in.next();

		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
		}
		String t = "";
		for(char ch:set) {
			t = t+ch;
		}
		
		System.out.println(t);
	}

}
