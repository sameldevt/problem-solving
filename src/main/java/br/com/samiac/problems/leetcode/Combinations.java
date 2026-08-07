package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> result = new ArrayList<>();

		backtrack(result, new ArrayList<>(), k, n, 1);

		return result;
	}

	public void backtrack(List<List<Integer>> result, List<Integer> l, int k, int n, int i) {

		if (l.size() == k) {
			result.add(new ArrayList<>(l));
			return;
		}

		for (int j = i; j <= n; j++) {
			l.add(j);
			backtrack(result, l, k, n, j + 1);
			l.removeLast();
		}
	}
}
