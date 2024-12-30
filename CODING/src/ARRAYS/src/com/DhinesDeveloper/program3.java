package com.DhinesDeveloper;
/*
 * find the common Elements in the three array and print it.
 */
public class program3 {
	private static void findCommonElements(int[] ar1,int[] ar2,int[] ar3) {
		int x=0,y=0,z=0;
		
		while(x <ar1.length && y < ar2.length && z < ar3.length) {
			if(ar1[x] == ar2[y] && ar2[y] == ar3[z]) {
				System.out.println(ar1[x]);
				x++;
				y++;
				z++;
			}
			else if(ar1[x] > ar2[y]) {
				y++;
			}else if(ar2[y] > ar3[z]) {
				z++;
			}else {
				x++;
			}
		}
	}
	public static void main(String[] args) {
		int[] ar1 = {1,5,10,20,40,80};
		int[] ar2 = {6,7,20,80,100};
		int[] ar3 = {3,4,15,20,30,70,80,120};
		
		findCommonElements(ar1,ar2,ar3);
	}
// output = 20
}
