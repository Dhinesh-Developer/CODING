package com.DhinesDeveloper;

import java.util.HashMap;

// Find the Element that appears once in the sorted array.
public class program15 {
	private static void uniqueElement(int[] ar) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<ar.length;i++) map.put(ar[i], map.getOrDefault(ar[i], 0)+1);
		   for (int key : map.keySet()) {
	            if (map.get(key) == 1) {
	                System.out.println("The unique element is: " + key);
	                return;
	            }
	        }
		
	}
	public static void main(String[] args) {
		int[] ar = {1,1,2,3,3,4,4,5,5};
		uniqueElement(ar);
	}
//The unique element is: 2
}
