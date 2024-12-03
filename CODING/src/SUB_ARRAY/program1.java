package SUB_ARRAY;

import java.util.Scanner;

public class program1 {
	private static int printSubarrayEqualToK(int[] ar,int s,int k) {
		int cnt = 0;
		for(int i=0;i<ar.length-s;i++) {
			int sum = 0;cnt=0;
			for(int j=i;j<i+s;i++) {
				sum = sum+ar[j];
			}
			if(sum == k) {
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++)
		{
			ar[i] = in.nextInt();
		}
		int s = in.nextInt();
		int k = in.nextInt();
		int res = printSubarrayEqualToK(ar,s,k);
		System.out.println("result is "+res);
	}

}
