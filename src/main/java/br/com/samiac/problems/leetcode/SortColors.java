package br.com.samiac.problems.leetcode;

public class SortColors {
	public void sortColors(int[] nums) {
		for (int index = 1; index < nums.length; index++) {
			int key = nums[index];
			int j = index - 1;

			while (j > -1 && nums[j] > key) {
				nums[j + 1] = nums[j];
				j -= 1;
			}

			nums[j + 1] = key;
		}
	}
}
