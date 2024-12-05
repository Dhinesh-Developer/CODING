package STRING;
import java.util.Scanner;
// Given an string s.write a program to reverse the string.
public class program1 {
	public static String reverseString(String s) {
		String t = "";
		for(int i=s.length()-1;i>=0;i--) {
			t = t+s.charAt(i);
		}
		return t;
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String res = reverseString(s);
		System.out.println("Reversed String:"+res);
	}

}
