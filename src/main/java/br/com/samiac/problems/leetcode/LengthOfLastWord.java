package br.com.samiac.problems.leetcode;

public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {

		String[] a = s.split(" ");

		for (int index = a.length - 1; index >= 0; index--) {
			String x = a[index];

			if (!x.isEmpty()) {
				return x.length();
			}
		}

		return 0;
	}
}
