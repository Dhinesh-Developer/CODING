package IF;

import java.util.Scanner;

public class program15 {
	static String vowelsOrConsonants(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c== 'o' || c=='u') {
			return "it is Vowel";
		}else {
			return "Is is not vowels";
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char c = in.next().charAt(0);
		String res = vowelsOrConsonants(c);
		System.out.println(res);
	}

}
