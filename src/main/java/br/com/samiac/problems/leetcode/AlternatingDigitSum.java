package br.com.samiac.problems.leetcode;

public class AlternatingDigitSum {

	public int alternateDigitSum(int n) {
		int sum = 0;

		int i = 0;

		int divisor = 1;

		while (n / divisor >= 10) {
			divisor *= 10;
		}

		while (divisor > 0) {
			int v = n / divisor;

			if (i % 2 == 0) {
				sum += v;
			} else {
				sum -= v;
			}

			i++;
			n %= divisor;
			divisor /= 10;
		}

		return sum;
	}
}
