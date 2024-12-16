package MAP;

import java.util.HashSet;
import java.util.Scanner;
// find the group count of possible adjacent element.
public class program6 {
	private static void countGroup(int[] ar) {
		int cnt = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<ar.length;i++) {
			if(set.contains(ar[i])) {
				cnt++;
				set.clear();
			}else {
				set.add(ar[i]);
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i] = in.nextInt();
		}
		countGroup(ar);
	}

}
