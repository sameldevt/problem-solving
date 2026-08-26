package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CheckIfNumberHasEqualDigitCountAndDigitValue {

	public static boolean digitCount(String num) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < num.length(); i++) {
			int n = num.charAt(i) - '0';

			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}
		}

		for (int i = 0; i < num.length(); i++) {
			int m = num.charAt(i) - '0';
			Integer n = map.get(i);

			if (n == null && m == 0) {
				continue;
			}

			if (n == null) {
				return false;
			}

			if (n != m) {
				return false;
			}
		}

		return true;
	}
}
