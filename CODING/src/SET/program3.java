package SET;

import java.util.TreeSet;

public class program3 {
// printing in sorted order.
// treeset 	
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(45);
		set.add(7);
		set.add(98);
		for(Integer x : set) {
			System.out.println(x);
		}
	}

}
