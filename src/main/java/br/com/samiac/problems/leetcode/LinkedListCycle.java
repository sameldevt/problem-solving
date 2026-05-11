package br.com.samiac.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

import br.com.samiac.problems.utils.ListNode;

public class LinkedListCycle {

	public static boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<>();
		return search(head, set);
	}

	private static boolean search(ListNode head, Set<ListNode> set) {
		if (head == null) {
			return false;
		}

		if (set.contains(head)) {
			return true;
		}

		set.add(head);

		return search(head.next, set);
	}
}
