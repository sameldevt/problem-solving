package br.com.samiac.problems.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class StringConstruction {

	public static int stringConstruction(String s) {

		Map<Character, Integer> map = new HashMap<>();

		int cost = 0;

		for (int index = 0; index < s.length(); index++) {

			char c = s.charAt(index);

			if (!map.containsKey(c)) {
				map.put(c, 1);
				cost++;
			}
		}

		return cost;
	}
}
