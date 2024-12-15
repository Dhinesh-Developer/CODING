package MAP;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class program5 {
	private static void mostRepeatedWords(String s){
		String[] ar = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<ar.length;i++) {
			if(map.containsKey(ar[i])) {
				int c = map.get(ar[i]);
				map.put(ar[i], c+1);
			}else {
				map.put(ar[i], 1);
			}
		}
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String,Integer> e:entries) {
			if(e.getValue()>=3) {
			System.out.println(e.getKey()+":"+e.getValue());
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		mostRepeatedWords(s);
		
	}

}
