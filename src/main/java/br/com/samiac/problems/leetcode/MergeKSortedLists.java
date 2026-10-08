package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.samiac.problems.utils.ListNode;

public class MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> list = new ArrayList<>();

		for (ListNode l : lists) {

			ListNode t = l;

			while (t != null) {

				list.add(t.val);

				t = t.next;
			}
		}

		if (list.isEmpty()) {
			return null;
		}

		list.sort(Comparator.naturalOrder());

		ListNode head = new ListNode(list.getFirst());
		ListNode temp = head;

		for (int i = 1; i < list.size(); i++) {
			temp.next = new ListNode(list.get(i));
			temp = temp.next;
		}

		return head;
	}
}
