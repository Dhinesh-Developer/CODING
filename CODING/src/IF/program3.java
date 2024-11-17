package IF;

import java.util.Scanner;
// check if the number is Ending With zero or not
public class program3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%10==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
