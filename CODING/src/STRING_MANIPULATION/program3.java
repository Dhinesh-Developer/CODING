package STRING_MANIPULATION;

import java.util.Scanner;
// move sum of digits present in the String to last.
public class program3 {
	private static String method(String s) {
		String t1 = "";
		int sum = 0;
		String t = "";
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z') ){
				t1 = t1+c;
			}
			else if(c>='0' && c<='9') {
				sum = sum+(c -48);
			}
		}
		t = t1+sum;
		return t;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String res = method(s);
		System.out.println(res);
		
	}

}
