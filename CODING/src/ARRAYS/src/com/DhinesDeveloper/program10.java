package com.DhinesDeveloper;
// merge two sorted array using third sorted array
public class program10 {
	private static void merge(int[] ar1,int[] ar2) {
		int[] res = new int[ar1.length+ar2.length];
		int i=0,j=0,k=0;
		
		while(i<ar1.length && j< ar2.length) {
			if(ar1[i] < ar2[j]) res[k++] = ar1[i++];
			else res[k++] = ar2[j++];
		}
		
		while(i<ar1.length) res[k++] = ar1[i++];
		while(j<ar2.length) res[k++] = ar2[j++];
		
		for(int x: res) System.out.print(x+" ");
	}
	public static void main(String[] args) {
		
		int[] ar1 = {1,5,6,7};
		int[] ar2 = {2,5,8,9,11};
		merge(ar1,ar2);
	}
//1 2 5 5 6 7 8 9 11 
}
