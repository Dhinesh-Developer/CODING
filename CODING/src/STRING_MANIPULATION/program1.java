package STRING_MANIPULATION;

import java.util.Scanner;
 // remove special characters.
public class program1 {
	private static String removeSpecialCharacters(String s) {
		String t = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9') ) {
				t = t+c;
			}
		}
		return t;
	}
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 String s = in.nextLine();
		 String res = removeSpecialCharacters(s);
		 System.out.println(res);
	}

}
