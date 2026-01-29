package br.com.samiac.problems.leetcode;

public class RemoveDuplicatesFromSortedArray {

	// time = o(n)
	public static int removeDuplicates(int[] nums) {

		int k = 1;

		int lastModIndex = 0;

		for (int index = 0; index < nums.length; index++) {

			if (index < nums.length - 1 && nums[index] < nums[index + 1]) {
				nums[lastModIndex + 1] = nums[index + 1];
				lastModIndex++;
				k++;
			}
		}

		return k;
	}
}
