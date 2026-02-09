package br.com.samiac.problems.hackerrank;

import java.util.List;

public class FairRations {

	/*
		1, 3, 4, 5, 6
	 */
	public static String fairRations(List<Integer> B) {

		int count = 0;

		for (int index = 0; index < B.size(); index++) {

			int value = B.get(index);

			if (value % 2 != 0) {

				B.set(index, value + 1);

				count++;

				if (index < B.size() - 1) {
					B.set(index + 1, B.get(index + 1) + 1);
					count++;
				} else {
					return "NO";
				}
			}
		}

		return String.valueOf(count);
	}
}
