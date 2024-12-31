package STRINGS;
//count the number of words in the String
// \\s+  cannot accept , it does not count the space.

public class program5 {
	private static void countWords(String s) {
		System.out.println(s.split("\\s+").length);
	}
	public static void main(String[] args) {
		String s = "java program to   write    a count      words"; //7
		countWords(s);
	}

}
