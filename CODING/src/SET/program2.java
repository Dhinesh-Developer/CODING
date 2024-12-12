package SET;

import java.util.LinkedList;

public class program2 {
// duplicates allowed
// insertion order maintained;
//	default value is any object is null.
	public static void main(String[] args) {
		LinkedList<Integer> set = new LinkedList<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(10);
		System.out.println(set);
	}

}
