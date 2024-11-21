package LOOP_PROGRAM;
import java.util.Scanner;

// write a program to print the sum of all digits is n. input = 12431   output = 10
public class program5 {
	static int sumOfAllDigits(int n) {
		 int sum = 0;
		 int rem = 0;
		 for(int i=0;i<n;i++) {
			 rem = n%10;
			 sum = sum+rem;
			 n = n/10;
		 }
		 return sum;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = sumOfAllDigits(n);
		System.out.println("Sum is: "+sum);
	}

}
