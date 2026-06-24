package br.com.samiac.problems.leetcode;

public class MinMaxGame {

	public int minMaxGame(int[] nums) {
		int n = nums.length;

		while (n != 1) {
			int[] newNums = new int[n / 2];

			for (int index = 0; index < newNums.length; index++) {
				if (index % 2 == 0) {
					newNums[index] = Math.min(nums[2 * index], nums[2 * index + 1]);
				} else {
					newNums[index] = Math.max(nums[2 * index], nums[2 * index + 1]);
				}
			}

			nums = newNums;
			n = nums.length;
		}

		return nums[0];
	}
}
