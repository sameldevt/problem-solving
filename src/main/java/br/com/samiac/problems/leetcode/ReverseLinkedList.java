package br.com.samiac.problems.leetcode;

import br.com.samiac.problems.utils.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {

        ListNode nHead = null;
        ListNode pNode = null;

        while (head != null) {

            if (pNode != null) {
                pNode = new ListNode(head.val, pNode);
            } else {
                pNode = new ListNode(head.val);
            }

            if (head.next == null) {
                nHead = pNode;
            }

            head = head.next;
        }

        return nHead;
    }
}
