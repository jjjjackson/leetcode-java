package leetcode.tw.jackson.lintcode.s0228;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.tw.jackson.structure.ListNode;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void givenByQuestion() {
        List<Tester<int[], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[], Integer>(new int[] { 1, 2, 3 }, 2),
                new Tester<int[], Integer>(new int[] { 1, 2 }, 1),
                new Tester<int[], Integer>(new int[] { 1, 3, 2, 4, 6, 7 }, 2)
            )
        );

        testers.forEach(
            tester -> {
                var head = ListNode.createList(tester.question);
                assertEquals(
                    tester.answer,
                    new Solution().middleNode(head).val
                );
            }
        );
    }
}
