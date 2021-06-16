package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class Solution1091Test {

    @Test
    public void testSuccessCases() {
        List<Tester<int[][], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[][], Integer>(
                    new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } },
                    3
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { 0, 0 }, { 0, 0 } },
                    2
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { 0, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 } },
                    4
                ),
                new Tester<int[][], Integer>(
                    new int[][] {
                        { 0, 0, 0, 1 },
                        { 0, 0, 1, 0 },
                        { 0, 1, 0, 0 },
                        { 1, 0, 0, 0 },
                    },
                    4
                ),
                new Tester<int[][], Integer>(
                    new int[][] {
                        { 0, 1, 1, 1 },
                        { 1, 0, 1, 1 },
                        { 0, 1, 1, 1 },
                        { 1, 0, 0, 0 },
                    },
                    6
                )
            )
        );
        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution1091().shortestPathBinaryMatrix(tester.question)
                )
        );
    }

    public void testFailCases() {
        List<Tester<int[][], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[][], Integer>(
                    new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } },
                    -1
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } },
                    -1
                ),
                new Tester<int[][], Integer>(
                    new int[][] { { 0, 0, 0 }, { 1, 1, 1 }, { 0, 0, 0 } },
                    -1
                )
            )
        );
        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution1091().shortestPathBinaryMatrix(tester.question)
                )
        );
    }
}
