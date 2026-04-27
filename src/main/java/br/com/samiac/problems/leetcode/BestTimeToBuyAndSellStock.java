package br.com.samiac.problems.leetcode;

public class BestTimeToBuyAndSellStock {

	public static int maxProfit(int[] prices) {

		int p = 0;
		int l = Integer.MAX_VALUE;

		for (int index = 0; index < prices.length; index++) {
			int v = prices[index];

			if (v < l) {
				l = v;
				int i = index + 1;

				while (i < prices.length) {
					int v2 = prices[i];

					if (v2 > v) {
						int tP = v2 - v;

						if (tP > p) {
							p = tP;
						}
					}

					i++;
				}
			}

		}

		return p;
	}
}
