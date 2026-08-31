package br.com.samiac.problems.leetcode;

public class MinimumNumberOfFlipsToReverseBinaryString {

	public int minimumFlips(int n) {
		String s = Integer.toBinaryString(n);

		int count = 0;
		int left = 0;
		int right = s.length() - 1;

		while (left < right) {
			char l = s.charAt(left);
			char r = s.charAt(right);

			if (l != r) {
				count += 2;
			}

			left++;
			right--;
		}

		return count;
	}
}
