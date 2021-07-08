package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class Solution646Test {

    @Test
    public void testSuccessCases() {
        List<Tester<int[][], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[][], Integer>(
                    new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 } },
                    2
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { 1, 2 }, { 7, 8 }, { 4, 5 } },
                    3
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { -10, 5 }, { -1, 8 }, { 9, 10 } },
                    2
                )
            )
        );
        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0646().findLongestChain(tester.question)
                )
        );
    }
}
