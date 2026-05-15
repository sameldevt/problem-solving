package br.com.samiac.problems.leetcode;

import br.com.samiac.problems.utils.ListNode;

public class RemoveLinkedListElements {

	//[1,2,6,3,4,5,6]
	public static ListNode removeElements(ListNode head, int val) {

		ListNode tHead = null;
		ListNode tBody = null;

		while (head != null) {
			if (head.val != val) {
				if (tHead == null) {
					tHead = new ListNode(head.val);
					tBody = tHead;
				} else {
					tBody.next = new ListNode(head.val);
					tBody = tBody.next;
				}
			}

			head = head.next;
		}

		return tHead;
	}
}
