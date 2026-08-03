package br.com.samiac.problems.leetcode;

public class MaxConsecutiveOnes {

	public int findMaxConsecutiveOnes(int[] nums) {
		int consecutives = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int n = nums[i];

			if (n == 1) {
				count++;
			}

			if (n == 0 || i == nums.length - 1) {
				if (count > consecutives) {
					consecutives = count;
				}
				count = 0;
			}
		}

		return consecutives;
	}
}
