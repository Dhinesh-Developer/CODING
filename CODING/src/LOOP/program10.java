package LOOP;

import java.util.Scanner;
//Check whether the given number is prime or not.
public class program10 {
	public static void primeNumberCheck(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println(n+" is prime");
		}
		else {
			System.out.println(n+" is not prime");
		}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		primeNumberCheck(n);
	}

}
