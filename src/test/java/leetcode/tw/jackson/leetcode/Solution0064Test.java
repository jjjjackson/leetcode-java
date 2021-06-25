package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class Solution0064Test {

    @Test
    public void testSuccessCases() {
        List<Tester<int[][], Integer>> testers = new ArrayList<>();
        testers.add(
            new Tester<int[][], Integer>(
                new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } },
                7
            )
        );
        testers.add(
            new Tester<int[][], Integer>(
                new int[][] { { 1, 2, 3 }, { 4, 5, 6 } },
                12
            )
        );
        testers.add(
            new Tester<int[][], Integer>(new int[][] { { 1, 2 }, { 1, 1 } }, 3)
        );

        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0064().minPathSum(tester.question)
                )
        );
    }
}
