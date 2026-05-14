package br.com.samiac.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

import br.com.samiac.problems.utils.ListNode;

public class IntersectionOfTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

		Set<ListNode> setA = new HashSet<>();
		traverse(headA, setA);

		ListNode headBTemp = headB;

		while (headBTemp != null) {
			if (setA.contains(headBTemp)) {
				break;
			}

			headBTemp = headBTemp.next;
		}

		return headBTemp;
	}

	private void traverse(ListNode headA, Set<ListNode> set) {
		if (headA != null) {
			set.add(headA);
			traverse(headA.next, set);
		}
	}
}
