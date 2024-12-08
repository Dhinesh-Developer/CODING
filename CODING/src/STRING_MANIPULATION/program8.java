package STRING_MANIPULATION;

import java.util.Scanner;

public class program8 {
	static int indexOfCharacters(String s,char k) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == k) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char k = in.next().charAt(0);
		int res = indexOfCharacters(s,k);
		System.out.println(res);
	}

}
