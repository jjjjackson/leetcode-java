package leetcode.tw.jackson.structure;

import java.util.*;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x, ListNode node) {
        val = x;
        next = node;
    }

    public ListNode(int x) {
        this(x, null);
    }

    public ListNode() {
        this(0, null);
    }

    public static int[] listToArray(ListNode head) {
        List<Integer> result = new ArrayList<>();

        while (head != null) {
            result.add(head.val);
            head = head.next;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static ListNode createList(int[] numbers) {
        if (numbers.length == 0) {
            return null;
        }

        ListNode head = new ListNode(numbers[0]);
        ListNode prev = head;

        for (int i = 1; i < numbers.length; i++) {
            ListNode current = new ListNode(numbers[i]);
            prev.next = current;
            prev = current;
        }

        return head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ " + val + ", ");
        ListNode head = next;

        while (head != null) {
            sb.append(head.val);
            if (head.next != null) {
                sb.append(", ");
            }
            head = head.next;
        }
        sb.append(" ]");

        return sb.toString();
    }
}
