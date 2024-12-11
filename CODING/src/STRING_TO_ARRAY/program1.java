package STRING_TO_ARRAY;
import java.util.Scanner;
// given an String s.write a program that prints each words in the string on a new line.use array.

public class program1 {
	
	private static int countwords(String s) {
		int cnt = 0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)== ' ' && s.charAt(i+1)!=' ') {
				cnt++;
			}
		}
		return s.charAt(0)==' '?cnt:cnt+1;
	}
	private static String[] splitString(String s) {
		String t = "";
		int j = 0;
		int count = countwords(s);
		String[] ar = new String[count];
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != ' ') {
				t = t+s.charAt(i);
			}
			else if(t.length()>0) {
				ar[j] = t;
				j++;
				t = "";
			}
		}
		ar[j] = t;
		return ar;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String[] ar = splitString(s);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

}
