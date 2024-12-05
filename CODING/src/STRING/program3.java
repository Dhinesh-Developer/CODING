package STRING;
import java.util.Scanner;
// given a string s.write a program to print the numbers of spaces in the string.
class count{
	int cnt = 0;
	public int countSpacesBetween(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				cnt++;
			}
		}
		return cnt;
	}
}
public class program3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		count c = new count();
		int res = c.countSpacesBetween(s);
		System.out.println("space between is: "+res);
	}

}
