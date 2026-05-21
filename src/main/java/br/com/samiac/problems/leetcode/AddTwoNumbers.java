package br.com.samiac.problems.leetcode;

import br.com.samiac.problems.utils.ListNode;

import java.math.BigInteger;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tHead = null;
        ListNode head = null;

        StringBuilder strL1 = new StringBuilder();

        while (l1 != null) {
            strL1.insert(0, l1.val);
            l1 = l1.next;
        }

        StringBuilder strL2 = new StringBuilder();

        while (l2 != null) {
            strL2.insert(0, l2.val);
            l2 = l2.next;
        }

        BigInteger vL1 = new BigInteger(strL1.toString());
        BigInteger vL2 = new BigInteger(strL2.toString());

        String r = String.valueOf(vL1.add(vL2));

        for (int index = r.length() - 1; index >= 0; index--) {
            int v = r.charAt(index) - 48;

            if (head == null) {
                head = new ListNode(v);
                tHead = head;
            } else {
                head.next = new ListNode(v);
                head = head.next;
            }
        }


        return tHead;
    }
}
