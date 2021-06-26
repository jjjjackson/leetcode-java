package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class Solution0070Test {

    @Test
    public void testSuccessCases() {
        List<Tester<Integer, Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<Integer, Integer>(3, 3),
                new Tester<Integer, Integer>(2, 2),
                new Tester<Integer, Integer>(1, 1),
                new Tester<Integer, Integer>(45, 1836311903)
            )
        );

        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0070().climbStairs(tester.question)
                )
        );
    }
}
