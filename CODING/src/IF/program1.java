package IF;

import java.util.Scanner;
// check if the number is divided by two .
public class program1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%2==0) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}

}
