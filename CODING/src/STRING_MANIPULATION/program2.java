package STRING_MANIPULATION;

import java.util.Scanner;
// move numeric to last.
public class program2 {
	private static String method(String s) {
		String t1 = "";
		String t2 = "";
		String t = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z') ){
				t1 = t1+c;
			}
			else if(c>='0' && c<='9') {
				t2 = t2+c;
			}
		}
		t = t1+t2;
		return t;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String res = method(s);
		System.out.println(res);
	}

}
