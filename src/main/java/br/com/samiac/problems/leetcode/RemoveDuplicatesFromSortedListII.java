package br.com.samiac.problems.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.sun.source.tree.Tree;

import br.com.samiac.problems.utils.ListNode;

public class RemoveDuplicatesFromSortedListII {

	public ListNode deleteDuplicates(ListNode head) {

		Map<Integer, Integer> m = new TreeMap<>();

		while (head != null) {
			int val = head.val;

			if (m.containsKey(val)) {
				m.put(val, m.get(val) + 1);
			} else {
				m.put(val, 1);
			}

			head = head.next;
		}

		ListNode last = null;
		ListNode newHead = null;

		for (Integer i : m.keySet()) {

			int val = m.get(i);

			if (val == 1) {
				if (last == null) {
					last = new ListNode(i);
					newHead = last;
				} else {
					last.next = new ListNode(i);
					last = last.next;
				}
			}
		}

		return newHead;
	}
}
