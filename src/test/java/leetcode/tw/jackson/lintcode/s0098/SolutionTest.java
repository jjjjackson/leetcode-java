package leetcode.tw.jackson.lintcode.s0098;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.tw.jackson.structure.ListNode;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void testGivenByQuestion() {
        List<Tester<int[], int[]>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[], int[]>(
                    new int[] { 1, 4, 3, 2, 5 },
                    new int[] { 1, 2, 3, 4, 5 }
                ),
                new Tester<int[], int[]>(
                    new int[] { 1, 3, 2, 4 },
                    new int[] { 1, 2, 3, 4 }
                ),
                new Tester<int[], int[]>(
                    new int[] { 1, 7, 2, 6 },
                    new int[] { 1, 2, 6, 7 }
                )
            )
        );

        testers.forEach(
            tester -> {
                var head = ListNode.createList(tester.question);
                var resultHead = new Solution().sortList(head);
                var result = ListNode.listToArray(resultHead);
                assertArrayEquals(tester.answer, result);
            }
        );
    }
}
