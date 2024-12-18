package IF;

import java.util.Scanner;
 // sort three number without using array.
public class program19 {
	public static void sortWithoutArray(int a,int b,int c) {
		  if (a > b) {
	            int temp = a;
	            a = b;
	            b = temp;
	        }
	        if (b > c) {
	            int temp = b;
	            b = c;
	            c = temp;
	        }
	        if (a > b) {
	            int temp = a;
	            a = b;
	            b = temp;
	        }
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		sortWithoutArray(a,b,c);
	}

}
