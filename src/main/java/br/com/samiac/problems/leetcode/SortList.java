package br.com.samiac.problems.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.samiac.problems.utils.ListNode;

public class SortList {

	public static ListNode sortList(ListNode head) {
		List<Integer> list = new ArrayList<>();

		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		list.sort(Comparator.naturalOrder());

		ListNode nH = new ListNode(list.getFirst());
		ListNode nH2 = nH;

		for (int index = 1; index < list.size(); index++) {
			nH.next = new ListNode(list.get(index));
			nH = nH.next;
		}

		return nH2;
	}
}
