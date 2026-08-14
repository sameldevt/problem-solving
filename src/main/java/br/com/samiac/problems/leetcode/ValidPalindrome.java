package br.com.samiac.problems.leetcode;

public class ValidPalindrome {

	/*
		first impl

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sr = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
				sb.append(c);
				sr.insert(0, c);
			}

			if (c >= 'A' && c <= 'Z') {
				sb.append((char) (c + 32));
				sr.insert(0, (char) (c + 32));
			}
		}

		return sb.toString().contentEquals(sr.toString());
	}
	 */

	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();

		for (char c : s.toCharArray()) {
			if (Character.isDigit(c) || Character.isLetter(c)) {
				sb.append(Character.toLowerCase(c));
			}
		}

		boolean isPalindrome = true;

		int start = 0;
		int end = sb.length() - 1;

		while (start < sb.length()) {
			if (sb.charAt(start) != sb.charAt(end)) {
				isPalindrome = false;
				break;
			}

			start++;
			end--;
		}

		return isPalindrome;
	}
}
