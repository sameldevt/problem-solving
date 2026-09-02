package br.com.samiac.problems.leetcode;

public class RemoveAllOccurrencesOfASubstring {

	public String removeOccurrences(String s, String part) {
		StringBuilder sb = new StringBuilder(s);

		while (sb.toString().contains(part)) {
			int i = sb.indexOf(part);
			sb.delete(i, i + part.length());
		}

		return sb.toString();
	}
}
