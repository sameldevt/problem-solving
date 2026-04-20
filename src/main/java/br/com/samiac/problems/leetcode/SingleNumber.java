package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	public static int singleNumber(int[] nums) {
		int x = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < nums.length; index++) {
			int c = nums[index];

			if (map.get(c) != null) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}

		for (Integer i : map.keySet()) {
			if (map.get(i) == 1) {
				x = i;
				break;
			}
		}

		return x;
	}
}
