package MAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
// print the occurence of integer values in list.
public class program4 {
	private static void printOccurecne(int[] ar) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<ar.length;i++) {
			if(map.containsKey(ar[i])) {
				int cnt = map.get(ar[i]);
				map.put(ar[i], cnt+1);
			}else {
				map.put(ar[i], 1);
			}
		}
		//System.out.println(map);
		Collection<Integer> values = map.values();
		for(int value:values) {
			System.out.println(value);
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		printOccurecne(ar);
	}

}
