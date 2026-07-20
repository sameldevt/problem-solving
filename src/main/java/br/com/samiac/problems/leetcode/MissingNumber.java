package br.com.samiac.problems.leetcode;

public class MissingNumber {

	public int missingNumber(int[] nums) {

		int expected = nums.length;
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum += nums[index];
			expected += index;
		}

		return expected - sum;
	}
}
