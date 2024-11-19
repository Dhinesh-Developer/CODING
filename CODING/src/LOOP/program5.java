package LOOP;

import java.util.Scanner;
/*// print multiples of 2 and 3
20 = n
2 = a
3 = b
2 3 4 6 8 9 10 12 14 15 16 18 20 
 */
public class program5 {
	public static void printMultiplesOf2And3(int n,int a,int b) {
		for(int i=1;i<=n;i++){
			if(i%2==0 || i%3==0) {
				System.out.print(i+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		printMultiplesOf2And3(n,a,b);

	}

}
