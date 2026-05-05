package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

import br.com.samiac.problems.utils.TreeNode;

public class BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> l = new ArrayList<>();

		if (root != null) {
			traverse(root, l);
		}

		return l;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if (root != null) {
			traverse(root.left, list);
			list.add(root.val);
			traverse(root.right, list);
		}
	}
}
