package br.com.samiac.problems.leetcode;

public class CountingBits {

	public int[] countBits(int n) {
		int[] ans = new int[n + 1];

		for (int i = 0; i <= n; i++) {

			int total = 0;

			int y = i;

			while (y != 0) {
				int x = y & 1;

				if (x == 1) {
					total++;
				}

				y = y >> 1;
			}

			ans[i] = total;
		}

		return ans;
	}

}
