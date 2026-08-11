package br.com.samiac.problems.leetcode;

import br.com.samiac.problems.utils.TreeNode;

public class PathSum {

	public boolean hasPathSum(TreeNode root, int targetSum) {
		return traverse(root, 0, targetSum);
	}
	private boolean traverse(TreeNode root, int sum, int targetSum) {

		if (root == null) {
			return false;
		}

		sum += root.val;

		if (root.left == null && root.right == null) {
			return sum == targetSum;
		}

		return traverse(root.left, sum, targetSum)
				|| traverse(root.right, sum, targetSum);
	}
}
