package IF;

import java.util.Scanner;
// ASCII value are not UPPERCASE
public class program7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>=65 && n<=90) {
			System.out.println("Yes it is in upper ASCII value");
		}else {
			System.out.println("No is is is upper case ASCII value");
		}
	}

}
