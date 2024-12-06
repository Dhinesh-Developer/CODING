package STRING;

import java.util.Scanner;

public class program5 {
	private static int countVowels(String s) {
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c == 'a'|| c == 'e'|| c == 'o'|| c == 'i'|| c == 'u'||
					c == 'A'|| c == 'E'|| c == 'I'|| c == 'O'|| c == 'U'){
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int res = countVowels(s);
		System.out.println("count vowels is : "+res);
	}

}
