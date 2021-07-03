package leetcode.tw.jackson.lintcode.s0102;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.tw.jackson.structure.ListNode;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testNoCircle() {
        List<Tester<int[], Boolean>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[], Boolean>(new int[] { 1 }, false),
                new Tester<int[], Boolean>(new int[] { 1, 2 }, false),
                new Tester<int[], Boolean>(new int[] { 1, 2, 3 }, false)
            )
        );

        testers.forEach(
            tester -> {
                var head = ListNode.createList(tester.question);
                assertEquals(tester.answer, new Solution().hasCycle(head));
            }
        );
    }

    @Test
    public void testCircle() {
        List<Tester<int[], Boolean>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[], Boolean>(new int[] { 1 }, true),
                new Tester<int[], Boolean>(new int[] { 1, 2 }, true),
                new Tester<int[], Boolean>(new int[] { 1, 2, 3 }, true)
            )
        );

        testers.forEach(
            tester -> {
                var head = ListNode.createList(tester.question);

                var next = head;
                while (next.next != null) {
                    next = next.next;
                }
                next.next = head;

                assertEquals(tester.answer, new Solution().hasCycle(head));
            }
        );
    }

    @Test
    public void testNull() {
        assertEquals(false, new Solution().hasCycle(null));
    }
}
