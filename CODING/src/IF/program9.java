package IF;
import java.util.Scanner;

// write a progra to find the largest of three number.
public class program9 {
	public static int greatestOfThreeNum(int a,int b,int c) {
		int max1 =  a>b?a:b;
		int max2 =  b>c?b:c;
		int max =  max1>max2?max1:max2;
		return max;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int res = greatestOfThreeNum(a,b,c);
		System.err.println(res);
	}

}
