package br.com.samiac.challenges;

import java.util.List;

public class SubarrayDivision {

	public static int birthday(List<Integer> s, int d, int m) {

		int possibilities = 0;

		for (int index = 0; index < s.size(); index++) {

			if (m == 1 && s.get(index) == d) {
				possibilities++;
				continue;
			}

			int indexRange = index + m;

			if (indexRange <= s.size()) {

				int sum = 0;

				for (int index2 = index; index2 < indexRange; index2++) {
					sum += s.get(index2);
				}

				if (sum == d) {
					possibilities++;
				}

			}

		}

		return possibilities;
	}

}
