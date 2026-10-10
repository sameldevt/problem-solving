package br.com.samiac.problems.leetcode;

import br.com.samiac.problems.utils.TreeNode;

public class SumOfLeftLeaves {

	private class Sum {

		int val;

		public void sum(int v) {
			this.val += v;
		}
	}

	public int sumOfLeftLeaves(TreeNode root) {
		Sum sum = new Sum();

		if (root != null) {
			traverse(root, sum, false);
		}

		return sum.val;
	}

	private static void traverse(TreeNode root, Sum sum, boolean isLeft) {
		if (root != null) {
			traverse(root.left, sum, true);
			if (isLeft && root.left == null && root.right == null) {
				sum.sum(root.val);
			}
			traverse(root.right, sum, false);
		}
	}
}
