package leetcode.tw.jackson.lintcode.s0036;

import leetcode.tw.jackson.structure.ListNode;

public class Solution {

    /**
     * @param head: ListNode head is the head of the linked list
     * @param m: An integer
     * @param n: An integer
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m > n || head == null) {
            return head;
        }

        ListNode beforeHead = new ListNode();
        beforeHead.next = head;
        head = beforeHead;

        for (int i = 1; i < m; i++) {
            if (head == null) {
                return null;
            }

            head = head.next;
        }

        ListNode reverseHead = head;
        ListNode mNode = head.next;
        ListNode nNode = mNode;
        ListNode afterNNode = mNode.next;

        for (int i = m; i < n; i++) {
            if (afterNNode == null) {
                return null;
            }
            ListNode temp = afterNNode.next;
            afterNNode.next = nNode;
            nNode = afterNNode;
            afterNNode = temp;
        }
        mNode.next = afterNNode;
        reverseHead.next = nNode;

        return beforeHead.next;
    }
}
