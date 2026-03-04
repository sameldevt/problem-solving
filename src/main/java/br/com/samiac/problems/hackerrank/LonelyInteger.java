package br.com.samiac.problems.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

	public static int lonelyinteger(List<Integer> a) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int x : a) {
			if (map.containsKey(x)) {
				map.put(x, map.get(x) + 1);
			} else {
				map.put(x, 1);
			}
		}

		int x = 0;

		for (int p : map.keySet()) {
			if (map.get(p) == 1) {
				x = p;
				break;
			}
		}

		return x;
	}
}
