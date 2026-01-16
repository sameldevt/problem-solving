package br.com.samiac.problems.hackerrank;

import java.util.List;

public class DivisibleSumPairs {

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

		int possibilities = 0;

		for (int index = 0; index < n; index++) {

			for (int index2 = 1; index2 < n; index2++) {

				int sum = ar.get(index) + ar.get(index2);

				if (index < index2 && sum % k == 0) {
					possibilities++;
				}

			}

		}

		return possibilities;
	}
}
