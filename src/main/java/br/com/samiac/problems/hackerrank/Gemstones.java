package br.com.samiac.problems.hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Gemstones {

	public static int gemstones(List<String> arr) {
		int total = 0;

		Map<Character, Integer> map = new HashMap<>();

		for (String s : arr) {

			Set<Character> set = new HashSet<>();

			for (char c : s.toCharArray()) {
				if (!set.contains(c)) {
					set.add(c);

					if (map.containsKey(c)) {
						int v = map.get(c);
						map.put(c, v + 1);
					} else {
						map.put(c, 1);
					}
				}
			}
		}

		for (int v : map.values()) {
			if (v == arr.size()) {
				total++;
			}
		}

		return total;
	}

}
