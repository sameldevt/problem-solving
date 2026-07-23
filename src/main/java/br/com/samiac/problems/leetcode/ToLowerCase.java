package br.com.samiac.problems.leetcode;

public class ToLowerCase {

	public String toLowerCase(String s) {
		StringBuilder sb = new StringBuilder();

		for (int index = 0; index < s.length(); index++) {
			char c = s.charAt(index);

			if (c >= 'A' && c <= 'Z') {
				sb.append((char) (c + 32));
			} else {
				sb.append(c);
			}
		}

		return sb.toString();
	}
}
