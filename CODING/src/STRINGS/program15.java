package STRINGS;

import java.util.Stack;

// Valid parenthesis . string contains the (,{,[ etc and must have corresponding parenthesis
public class program15 {
	public static boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
			else {
				if(st.isEmpty()) return false;
				char ch1 = st.pop();
				if(ch1==')' || ch1 == '(' || ch1==']' || ch1 == '[' || ch1=='{' || ch1 == '}') continue;
				else return false;
			}
		}
		
		return st.isEmpty();
	}
	public static void main(String[] args) {
		String s = "()[{}()]";
		boolean res = isValid(s);
		System.out.println(res);
	}

}
