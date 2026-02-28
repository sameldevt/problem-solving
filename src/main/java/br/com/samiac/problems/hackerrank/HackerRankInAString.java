package br.com.samiac.problems.hackerrank;

public class HackerRankInAString {

	public static String hackerrankInString(String s) {
		char[] hackerrank = new char[] { 'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k' };
		char[] chars = s.toCharArray();

		int searchIndex = 0;
		int charCount = 0;

		for (char c : chars) {
			if (c == hackerrank[searchIndex]) {
				charCount++;
				searchIndex++;

				if (searchIndex == hackerrank.length) {
					break;
				}

			}
		}

		return charCount == hackerrank.length ? "YES" : "NO";
	}
}
