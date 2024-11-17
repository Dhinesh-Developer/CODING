package IF;

import java.util.Scanner;
// if the number is 2 digit print yes orherwise no
public class program2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n>9 && n<100) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
