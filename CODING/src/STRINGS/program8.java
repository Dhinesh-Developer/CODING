package STRINGS;

import java.util.Stack;

// reverse a string using stack
public class program8 {
	private static void reverseString(String s) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++) stack.push(s.charAt(i));
		while(!stack.empty()) System.out.print(stack.pop());
		System.out.println();
	}
	public static void main(String[] args) {
		String s = "java Programming";
		reverseString(s);
	}
//gnimmargorP avaj
}
