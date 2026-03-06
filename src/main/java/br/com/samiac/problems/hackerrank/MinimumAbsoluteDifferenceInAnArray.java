package br.com.samiac.problems.hackerrank;

import java.util.Comparator;
import java.util.List;

public class MinimumAbsoluteDifferenceInAnArray {

	public static int minimumAbsoluteDifference(List<Integer> arr) {
		int min = Integer.MAX_VALUE;

		arr.sort(Comparator.naturalOrder());

		int indexM1 = 0;

		for (int index = 1; index < arr.size(); index++) {

			int diff = Math.abs(arr.get(indexM1) - arr.get(index));

			if (diff < min) {
				min = diff;
			}

			indexM1 = index;
		}

		return min;
	}
}
