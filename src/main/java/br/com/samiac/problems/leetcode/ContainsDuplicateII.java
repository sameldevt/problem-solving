package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int index = 0; index < nums.length; index++) {
			int v = nums[index];

			if (map.containsKey(v)) {
				int mV = map.get(v);

				if (Math.abs(mV - index) <= k) {
					return true;
				}
			}

			map.put(v, index);
		}

		return false;
	}
}
