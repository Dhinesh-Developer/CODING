package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class program1 {
	// insertion order is not maintained.HashMap
	// insertion order is  maintained.LinkedHashMap
	// sorted order is  maintained.TreeMap   based on keyS
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<String,Integer>();
	//	LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
	//	TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		map.put("india", 900);
		map.put("america", 1200);
		//map.put(new ArithmeticException(), new ArrayIndexOutOfBoundsException()); is possible
		System.out.println(map); //{india=900, america=1200}
		System.out.println(map.size()); // 2
		System.out.println(map.get("india")); // 900
		System.out.println(map.containsKey("india")); // true
		System.out.println(map.containsValue(900)); // true
		System.out.println(map.keySet());//[india, america]
		System.out.println(map.values()); //[900, 1200]
		System.out.println(map.isEmpty()); //false
	}

}
