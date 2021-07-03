package leetcode.tw.jackson.lintcode.s0035;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.*;
import java.util.stream.Collectors;
import leetcode.tw.jackson.structure.ListNode;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testSuccessCases() {
        int[] tester = new int[] { 1, 2, 3, 4, 5 };
        var head = ListNode.createList(tester);
        List<Integer> expect = Arrays
            .stream(tester)
            .boxed()
            .collect(Collectors.toList());
        Collections.reverse(expect);

        var returnHead = new Solution().reverse(head);
        var result = ListNode.listToArray(returnHead);

        assertArrayEquals(expect.stream().mapToInt(i -> i).toArray(), result);
    }
}
