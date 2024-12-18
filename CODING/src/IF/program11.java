package IF;
import java.util.Scanner;
// write a program to check if the person is eligible to vote or not.
public class program11 {
	static void voteEligible(int a) {
		System.out.println(a>18?"Eligible":"Not Elgible");
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		voteEligible(a);
	}

}
