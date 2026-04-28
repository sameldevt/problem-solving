package br.com.samiac.problems.leetcode;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {
		int k = 0;

		for (int index = 0; index < nums.length; index++) {
			int v = nums[index];

			if (v == val) {
				int i = index;
				while (i < nums.length - 1) {
					nums[i] = nums[i + 1];
					i++;
				}

				nums[nums.length - 1] = 999;

				index--;
			} else if (v != 999) {
				k++;
			}
		}

		return k;
	}
}
