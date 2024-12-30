package com.DhinesDeveloper;

import java.util.Arrays;
import java.util.HashMap;

// two sum problem or two pair is equal to sum
public class program9 {
	/*O(n^2)
	 * private static int[] twoSum(int[] ar,int target) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[j] == (target-ar[i])) return new int[] {i,j};
			}
		}
		
	}
	 */
	
	private static int[] twoSum(int[] ar,int target) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<ar.length;i++) map.put(ar[i], i);
		
		for(int i=0;i<ar.length;i++) {
			int num = target-ar[i];
			if(map.containsKey(num) && map.get(num) !=i) return new int[] {i,map.get(num)};
		}
		return ar;
	}
	public static void main(String[] args) {
		int[] ar = {2,7,11,15};
		int target = 18;
		System.out.println(Arrays.toString((twoSum(ar,target))));
	}
//[1, 2]  O(n)
}
