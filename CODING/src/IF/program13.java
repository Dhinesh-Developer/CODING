package IF;

import java.util.Scanner;
 // leap year program
public class program13 {
	static String leapYearOrNOt(int year) {
		if((year%4==0 || year %4==0) && (year%100!=0)) {
			return "Leap year";
		}
		else {
			return "Not leap year";
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		String res = leapYearOrNOt(year);
		System.out.println(res);
	}

}
