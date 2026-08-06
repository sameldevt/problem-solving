package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();

		backtrack(result, new ArrayList<>(), nums);

		return result;
	}

	/*
				     []
			  /      |      \
			 1       2       3
		   /   \    /  \    /  \
		  2     3  1    3  1    2
		  |     |  |    |  |    |
		  3     2  3    1  2    1
	 */
	public void backtrack(List<List<Integer>> result, List<Integer> l, int[] nums) {

		if (l.size() == nums.length) {
			result.add(new ArrayList<>(l));
			return;
		}

		for (int n : nums) {
			if (l.contains(n)) {
				continue;
			}

			l.add(n);
			backtrack(result, l, nums);
			l.removeLast();
		}
	}
}
