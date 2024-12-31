
package com.DhinesDeveloper;
// Find the first and last position/occurrence of an element in a sorted array.
public class program24 {
	private static int[] firstAndLastOccurence(int[] ar,int target) {
		int start = -1;
		int end = -1;
		for(int i=0;i<ar.length;i++) {
			if(ar[i] == target && start ==-1) start = i;
			if(ar[i] == target && start != -1) end = i;
		}
		int[] res = {start,end};
		return res;
	}
	public static void main(String[] args) {
		int[] ar=  {1,4,7,8,8,11,11,11,12,13,13};
		int target = 11;
		int res[] = firstAndLastOccurence(ar,target);
		for(int x : res) System.out.print(x+" ");
	}
	// 5 7  first and last index of the target element.
}
