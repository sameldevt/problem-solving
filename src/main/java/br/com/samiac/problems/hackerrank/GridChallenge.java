package br.com.samiac.problems.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GridChallenge {

	/*
		c k
		i u
	 */
	public static String gridChallenge(List<String> grid) {

		boolean isAscending = true;

		List<String> sorted = new ArrayList<>();

		for (int index = 0; index < grid.size(); index++) {

			String s = grid.get(index);

			s = s.chars()
					.sorted()
					.collect(StringBuilder::new,
							StringBuilder::appendCodePoint,
							StringBuilder::append)
					.toString();

			sorted.add(s);

			if (index == 0) {
				continue;
			}

			for (int j = 0; j < s.length(); j++) {

				char c1 = sorted.get(index - 1).charAt(j);
				char c2 = s.charAt(j);

				if (c2 < c1) {
					isAscending = false;
					break;
				}
			}

			if (!isAscending) {
				break;
			}
		}

		return isAscending ? "YES" : "NO";
	}
}
