package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

import br.com.samiac.problems.utils.TreeNode;

public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> l = new ArrayList<>();

		if (root != null) {
			traverse(root, l);
		}

		return l;
	}

	private void traverse(TreeNode root, List<Integer> list) {
		if (root != null) {
			list.add(root.val);
			traverse(root.left, list);
			traverse(root.right, list);
		}
	}

}
