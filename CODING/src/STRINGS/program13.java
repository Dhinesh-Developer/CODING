package STRINGS;

import java.util.HashMap;

// Roman To Integer
/*
 * symbol     value
 * I			1
 * v			5
 * x			10
 * L			50
 * C			100
 * D			500
 * M			1000
 * 
 * 
 * ex1:
 * II -   2
 * xI  -  11
 * VI -   6
 * LVII  -57
 * */
public class program13 {
	private static int romanToInteger(String s) {
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int res = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))) {
				res = res+map.get(s.charAt(i));
			}else {
				res = res - map.get(s.charAt(i));
			}
		}
		res = res+map.get(s.charAt(s.length()-1));
		return res;
	}
	public static void main(String[] args) {
		String s = "XII";
		int res = romanToInteger(s);
		System.out.println(res);
	}
// 12
}
