package br.com.samiac.problems.leetcode;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	static Map<Character, Character> brackets = Map.of('(', ')', '{', '}', '[', ']');

	// time = o(n)
	public static boolean isValid(String s) {

		boolean valid = false;

		Stack<Character> opened = new Stack<>();

		for (int index = 0; index < s.length(); index++) {

			char c = s.charAt(index);

			if (!opened.isEmpty() && brackets.get(opened.peek()) == c) {
				opened.pop();
				valid = true;
			} else if (brackets.containsKey(c)) {
				opened.add(c);
			} else {
				return false;
			}

		}

		return valid && opened.isEmpty();
	}
}
