package STRINGS;
//java program to check whether a string is palindrome or not.
public class program2 {
	private static void palindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		boolean isPalindrome = true;
		while(start < end) {
			if(str.charAt(start)  != str.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		System.out.println(isPalindrome?true:false);
	}
	public static void main(String[] args) {
		String str = "racecar";
		palindrome(str);
	}
//true.
}
