package com.DhinesDeveloper;
// sort the array.
public class program18 {
	public static void sort(int[] ar) {
		int temp;
		int j;
		for(int i=0;i<ar.length;i++) {
			temp = ar[i];
			j = i-1;
			while(j>=0 && temp<ar[j]) {
				ar[j+1] = ar[j];
				j=j-1;
			}
			ar[j+1] =temp;
			
		}
	}
	public static void main(String[] args) {
		int[] ar = {0,1,1,0,1,2,0,1,2};
		sort(ar);
		for(int x:ar) System.out.print(x+" ");
	}
//	0 0 0 1 1 1 1 2 2 
}
