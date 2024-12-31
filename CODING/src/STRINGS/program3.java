package STRINGS;
// String reverse using recursion.
public class program3 {
//	reverse a String using Recursion.
	private static String reverseAString(String str) {
		if(str == null || str.length()==1) return str;
		return reverseAString(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		String str = "java";
		String res = reverseAString(str);
		System.out.println(res);
	}
//avaj
}
