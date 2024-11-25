package ARRAY;

import java.util.Scanner;
// find the max pair numbers of pairs return l+sl;
public class program18 {
	public static int maxPair(int[] ar) {
		int l = 0;
		int sl = 0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] > l) {
				sl = l;
				l = ar[i];
			}else if(ar[i] > sl) {
				sl = ar[i];
			}
		}
		return l+sl;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] ar = {3,2,7,4,9};
		int res = maxPair(ar);
		System.out.println("Max pair in the array: "+ res);
	}
//Max pair in the array: 16
}
