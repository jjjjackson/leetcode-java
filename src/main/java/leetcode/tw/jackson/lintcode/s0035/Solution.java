package leetcode.tw.jackson.lintcode.s0035;

import leetcode.tw.jackson.structure.ListNode;

public class Solution {

    /**
     * @param head: n
     * @return: The new head of reversed linked list.
     */
    public ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;

            prev = head;
            head = next;
        }

        return prev;
    }
}
