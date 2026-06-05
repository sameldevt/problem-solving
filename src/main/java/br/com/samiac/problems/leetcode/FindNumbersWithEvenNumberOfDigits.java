package br.com.samiac.problems.leetcode;

public class FindNumbersWithEvenNumberOfDigits {

	public int findNumbers(int[] nums) {

		int pairs = 0;

		for (int n : nums) {
			int c = String.valueOf(n).length();

			if (c % 2 == 0) {
				pairs++;
			}
		}

		return pairs;
	}
}
