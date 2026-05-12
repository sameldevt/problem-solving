package br.com.samiac.problems.leetcode;

import br.com.samiac.problems.utils.TreeNode;

public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);

		return Math.max(leftDepth, rightDepth) + 1;
	}
}
