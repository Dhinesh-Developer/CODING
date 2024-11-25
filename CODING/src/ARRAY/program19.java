package ARRAY;

import java.util.Scanner;
//find the min pair numbers of pairs return s+ss;
public class program19 {
	public static int minPair(int[] ar) {
		int s = Integer.MAX_VALUE;
		int ss = Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] < s) {
				ss = s;
				s = ar[i];
			}else if(ar[i] < ss) {
				ss = ar[i];
			}
		}
		int t = s+ss;
		return t;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ar = {3,2,7,4,9};
		int res = minPair(ar);
		System.out.println("Min pair in the array: "+ res);
	}
//Min pair in the array: 5
}
