package MAP;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class program2 {

	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		map.put("india", 900);
		map.put("japan", 1200);
		map.put("usa", 1500);
		Set<String> set = map.keySet();
		for(String key : set) {
			System.out.println(key);
		}
		// traverse an map. // way1 to traverse a map.
		for(String key:set) {
			int value = map.get(key);
			System.out.println(key+":"+value);
		}
		
		// print both key value. // way2 for traverse a map.
		Set<Entry<String, Integer>> entries = map.entrySet();
		for(Entry<String, Integer> e:entries) {
			System.out.println(e);
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
		}
	}

}
