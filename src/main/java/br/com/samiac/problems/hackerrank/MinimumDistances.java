package br.com.samiac.problems.hackerrank;

import java.util.List;

public class MinimumDistances {

	public static int minimumDistances(List<Integer> a) {

		int minDistance = a.size();

		for (int leftPointer = 0; leftPointer < a.size(); leftPointer++) {

			int leftValue = a.get(leftPointer);

			for (int rightPointer = a.size() - 1; rightPointer > leftPointer; rightPointer--) {

				int rightValue = a.get(rightPointer);

				int pointersDiff = Math.abs(leftPointer - rightPointer);

				if (leftValue == rightValue && pointersDiff < minDistance) {
					minDistance = pointersDiff;
					break;
				}

			}

		}

		return minDistance == a.size() ? -1 : minDistance;
	}
}
