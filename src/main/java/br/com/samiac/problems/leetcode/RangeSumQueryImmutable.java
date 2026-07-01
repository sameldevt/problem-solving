package br.com.samiac.problems.leetcode;

public class RangeSumQueryImmutable {

	private final int[] nums;

	public RangeSumQueryImmutable(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int left, int right) {
		int sum = 0;

		for (int index = left; index <= right; index++) {
			sum += nums[index];
		}

		return sum;
	}
}
