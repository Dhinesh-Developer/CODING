package com.DhinesDeveloper;
// find the triplet with Given an sum in an array.
public class program26 {
	private static boolean findTripletSum(int[] ar,int sum) {
		if(ar.length<3) return false;
		int n =ar.length;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(ar[i]+ar[j]+ar[k] == sum) return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] ar= {1,4,45,6,10,8};
		int sum = 19;
		boolean res = findTripletSum(ar,sum);
		System.out.println(res);
	}
//true
}
