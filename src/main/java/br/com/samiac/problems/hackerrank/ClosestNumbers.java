package br.com.samiac.problems.hackerrank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClosestNumbers {

	public static List<Integer> closestNumbers(List<Integer> arr) {

		List<Integer> list = new ArrayList<>();

		arr.sort(Comparator.naturalOrder());

		int minDiff = Integer.MAX_VALUE;

		for (int index = 0; index < arr.size() - 1; index++) {

			int v1 = arr.get(index);
			int v2 = arr.get(index + 1);

			if (Math.abs(v1 - v2) < minDiff) {
				minDiff = Math.abs(v1 - v2);
			}
		}

		for (int index = 0; index < arr.size() - 1; index++) {

			int v1 = arr.get(index);
			int v2 = arr.get(index + 1);

			if (Math.abs(v1 - v2) == minDiff) {
				list.add(v1);
				list.add(v2);
			}
		}

		return list;
	}

}
