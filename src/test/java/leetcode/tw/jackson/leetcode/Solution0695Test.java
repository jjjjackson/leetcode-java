package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class Solution0695Test {

    @Test
    public void testSuccessCases() {
        List<Tester<int[][], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[][], Integer>(
                    new int[][] {
                        { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                        { 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 },
                        { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
                        { 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
                        { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 },
                    },
                    6
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0 } },
                    0
                )
            )
        );
        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0695().maxAreaOfIsland(tester.question)
                )
        );
    }
}
