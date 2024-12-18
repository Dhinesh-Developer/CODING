package IF;
import java.util.Scanner;
// write a program to check if the number is even or odd.
public class program10 {
	private static void evenOrOdd(int a) {
		if(a%2==0) {
			System.out.println("It is even"+a);
		}else {
			System.out.println(a+" it is odd.");
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		evenOrOdd(a);
	}

}
