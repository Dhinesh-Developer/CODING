package com.DhinesDeveloper;

import java.util.HashMap;
import java.util.Map;

// Find the majority element in the array.
// majority element means n/2 times.
public class program22 {
	public static int findMajorityElement(int[] ar) {
		HashMap<Integer,Integer> map = new HashMap<>();
		Integer res= null;
		for(int i=0;i<ar.length;i++) {
			map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
		}
		int val = ar.length/2;
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() > val) {
				res =entry.getKey();
				break;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int[] ar = {1,1,4,1,4,4,1,4,4};
		int res = findMajorityElement(ar);
		System.out.println(res);
	}
// 4 is the majority element present in the array .
}
