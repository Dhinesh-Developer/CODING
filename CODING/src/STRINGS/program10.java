package STRINGS;
// Find the Longest common prefix String Amongst an Array of Strings.
public class program10 {
	private static String findCommonPrefix(String[] s) {
		if(s == null || s.length ==0) return "";
		String lcp = s[0];
		for(int i=1;i<s.length;i++) {
			String currentword =s[i];
			int j=0;
			while(j<currentword.length() && j<lcp.length() && currentword.charAt(j)==lcp.charAt(j)) j++;
			if(j==0) return "";
			lcp = currentword.substring(0,j);

		}
		return lcp;
	}
	public static void main(String[] args) {
		String[] s = {"cat","cable","camera"};
		String lcp = findCommonPrefix(s);
		System.out.println(lcp);
	}
// ca
}
