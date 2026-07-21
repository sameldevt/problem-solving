package br.com.samiac.problems.leetcode;

public class ArrangingCoins {

	public int arrangeCoins(int n) {
		int rows = 0;

		for (int index = 1; index <= n; index++) {
			n -= index;

			if (n >= 0) {
				rows++;
			}
		}

		return rows;
	}
}
