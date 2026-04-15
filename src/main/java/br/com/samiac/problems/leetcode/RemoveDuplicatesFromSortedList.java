package br.com.samiac.problems.leetcode;

public class RemoveDuplicatesFromSortedList {

	public static ListNode deleteDuplicates() {

		ListNode head = new ListNode(1, new ListNode(1, new ListNode(1)));

		ListNode n = head;

		while (n != null && n.next != null) {
			if (n.val == n.next.val) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}

		return head;
	}

	static class ListNode {

		int val;

		ListNode next;

		ListNode() {}

		ListNode(int val) {this.val = val;}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return "ListNode{" + "val=" + val + ", next=" + next + '}';
		}
	}
}
