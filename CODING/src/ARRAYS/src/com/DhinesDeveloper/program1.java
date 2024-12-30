package com.DhinesDeveloper;

import java.util.HashSet;

/* Java program to find the duplicate in the array*/
public class program1 {
	public static void findDuplicates(int[] ar)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		boolean isDuplicates = false;
		for(int i=0;i<ar.length;i++) {
			if(set.contains(ar[i])) {
				isDuplicates = true;
				System.out.println(" Duplicates Elements: "+ar[i]);
			}else {
				set.add(ar[i]);
			}
		}
		if(!isDuplicates) {
			System.out.println(-1);
		}
		
	}
	public static void main(String[] args) {
		int[] ar = {1,5,4,2,1,4,7};
		findDuplicates(ar);
	}
	/*
	 * output = 
Duplicates Elements: 1
 Duplicates Elements: 4
	 */
}
