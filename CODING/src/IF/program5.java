package IF;

import java.util.Scanner;
// Check if the number is ending with 53.
public class program5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if(num%100==53) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
