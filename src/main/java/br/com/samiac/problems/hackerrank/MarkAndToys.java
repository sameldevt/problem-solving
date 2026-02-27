package br.com.samiac.problems.hackerrank;

import java.util.Comparator;
import java.util.List;

public class MarkAndToys {

	public static int maximumToys(List<Integer> prices, int k) {

		prices.sort(Comparator.naturalOrder());

		int sum = 0;
		int count = 0;

		for (Integer p : prices) {
			sum += p;

			if (sum > k) {
				break;
			}

			count++;
		}

		return count;
	}
}
