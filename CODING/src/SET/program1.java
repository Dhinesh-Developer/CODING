package SET;

import java.util.HashSet;

public class program1 {
	// HASH SET
// duplicates not allowed.
// does not follow insertion order.
// used for searching .
// default values is null
// Heterogeneous data types allowed	
	
	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		set.add(10);
		set.add(20);
		set.add(25);
		set.add(125);
		set.add(true);
		set.add("Hello");
		set.add(new ArithmeticException());
		set.add(90.25);
		set.add(new program1());
		System.out.println(set);
		
		
	}
/* output.
 * [java.lang.ArithmeticException, 20, Hello, SET.program1@4517d9a3, 90.25, 25, 10, 125, true]
	
 */
	
}
