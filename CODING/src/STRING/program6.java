package STRING;

import java.util.Scanner;
class Consonanats{
	public int countConsonants(String s) {
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c != 'a'&& c != 'e'&& c != 'o'&& c != 'i'&& c != 'u'&&
					c != 'A'&& c != 'E'&& c != 'I'&& c != 'O'&& c != 'U'){
				cnt++;
			}
		}
		return cnt;
	}
}

public class program6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		Consonanats cs = new Consonanats();
		int res = cs.countConsonants(s);
		System.out.println("count consonanats is : "+res);
	}

}
