package STRINGS;
// Java program to reverse each words in the String.
public class program7 {
	private static void reverseString(String s) {
		String[] words = s.split(" ");
		String revString = "";
		for(int i=0;i<words.length;i++) {
			String word = words[i];
			String revWords = "";
			for(int j=word.length()-1;j>=0;j++) revWords = revWords + word.charAt(j);
			revString  = revString+revWords+" ";
		}
		System.out.println(revString);
	}
	public static void main(String[] args) {
		String s = "java Programming";
		reverseString(s);
	}

}
