package IFELSE;

import java.util.Scanner;
// Greatest of Four number.
public class program3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int n4 = in.nextInt();
		int max1 = n1>n2?n1:n2;
		int max2 = n3>n4?n3:n4;
		int max = max1>max2?max1:max2;
		System.out.println("Value greater is:"+ max);
	}

}
