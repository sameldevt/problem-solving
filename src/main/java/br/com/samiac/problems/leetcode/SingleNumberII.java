package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {

	public int singleNumber(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int v : nums) {
			map.put(v, map.getOrDefault(v, 0) + 1);
		}

		for (int k : map.keySet()) {
			if (map.get(k) == 1) {
				return k;
			}
		}

		return 0;
	}
}
