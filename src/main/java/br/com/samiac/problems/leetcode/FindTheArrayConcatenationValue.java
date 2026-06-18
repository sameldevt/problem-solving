package br.com.samiac.problems.leetcode;

public class FindTheArrayConcatenationValue {

	public static long findTheArrayConcVal(int[] nums) {
		long conc = 0;

		int i = 0;
		int j = nums.length - 1;

		while (i <= j) {

			String s;

			if (i != j) {
				s = nums[i] + "" + nums[j];
			} else {
				s = nums[i] + "";
			}

			conc += Long.parseLong(s);

			i++;
			j--;
		}

		return conc;
	}
}
