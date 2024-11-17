package IF;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n%3==0 && n%5==0) {
			System.out.println("DHINESH DEVELOPER");
		}
		else if(n%3==0) {
			System.out.println("DHINESH");
		}else if(n%5==0){
			System.out.println("KUMAR");
		}
	}

}
