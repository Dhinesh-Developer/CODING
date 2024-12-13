package SET;

import java.util.Scanner;
import java.util.TreeSet;
// remove all duplicates url.
/* type 1
 * www.fb.com,www.ulaa.com,www.insta.com,www.tap.com
www.fb.com
www.insta.com
www.tap.com
www.ulaa.com

 */
public class program7 {
	private static void removeDuplicates(String s) {
		String[] ar = s.split(",");
		TreeSet<String> set = new TreeSet<String>();
		
		for(int i=0;i<ar.length;i++) {
			String[] p = ar[i].split(".");// type 2.
			set.add(p[1]);
		}
		
		for(String x : set) {
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		removeDuplicates(s);
	}

}
