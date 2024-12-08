package STRING_MANIPULATION;

import java.util.Scanner;

public class program7 {
	private static String removeExtraSpace(String s) {
		int si=0,ei=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				si = i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i) != ' ') {
				ei = i;
				break;
			}
		}
		String t= "";
		for(int i=si;i<=ei;i++)
		{
			if(s.charAt(i)!=' ' || (s.charAt(i)==' ' && s.charAt(i+1)!=' ')) {
				t =t+s.charAt(i);

			}
		}
		return t;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String res= removeExtraSpace(s);
		System.out.println(res);
	}

}
