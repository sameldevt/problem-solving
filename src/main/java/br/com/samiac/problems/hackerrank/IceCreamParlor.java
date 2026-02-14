package br.com.samiac.problems.hackerrank;

import java.util.List;

public class IceCreamParlor {

	public static List<Integer> icecreamParlor(int m, List<Integer> arr) {

		for (int i = 0; i < arr.size(); i++) {

			for (int j = i + 1; j < arr.size(); j++) {

				int vi = arr.get(i);
				int vj = arr.get(j);

				if (vi >= m || vj >= m) {
					continue;
				}

				if (vi + vj == m) {
					return List.of(i + 1, j + 1);
				}
			}

		}

		return List.of();
	}

}
