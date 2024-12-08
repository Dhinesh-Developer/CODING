package STRING_MANIPULATION;

import java.util.Scanner;

public class program6 {
	public static String addExtraCharacter(String s) {
		String t = "";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == 'a') {
				t = t+"*"+s.charAt(i);
			}else {
				t = t+s.charAt(i);
			}
		}
		return t;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String res= addExtraCharacter(s);
		System.out.println(res);
	}

}
