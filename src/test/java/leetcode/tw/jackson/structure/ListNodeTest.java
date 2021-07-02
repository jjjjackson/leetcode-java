package leetcode.tw.jackson.structure;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ListNodeTest {

    @Test
    public void testSuccessCases() {
        int[] tester = new int[] { 1, 2, 3, 4, 5 };
        ListNode header = ListNode.createList(tester);

        assertArrayEquals(tester, ListNode.listToArray(header));
    }

    @Test
    public void testNull() {
        int[] tester = new int[] {};
        ListNode header = ListNode.createList(tester);

        assertArrayEquals(tester, ListNode.listToArray(header));
    }
}
