package SUBSTRING;
import java.util.Scanner;
/*// check whether string t can be found as a subsequence in the string s.
hereiamsteckrank
hackerrank
Is present: YES
 */
public class program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		String res = subString(s,t);
		System.out.println("Is present: "+res);
	}

	private static String subString(String s, String t) {
		int i = 0;
		int j = 0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i) == s.charAt(j)) {
				i++;
				j++;
			}else {
				i++;
			}
		}
		return j == t.length()?"YES":"NO";
	}

}
