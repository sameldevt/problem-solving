package br.com.samiac.problems.leetcode;

import java.util.Arrays;

import br.com.samiac.problems.utils.TreeNode;

public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}

		if (nums.length == 1) {
			return new TreeNode(nums[0]);
		}

		int mid = nums.length / 2;

		TreeNode head = new TreeNode(nums[mid]);

		head.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
		head.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));

		return head;
	}
}
