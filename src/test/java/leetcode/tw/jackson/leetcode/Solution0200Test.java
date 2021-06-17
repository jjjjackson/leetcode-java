package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class Solution0200Test {

    @Test
    public void testSuccessCases() {
        List<Tester<char[][], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<char[][], Integer>(
                    new char[][] {
                        { '1', '1', '1', '1', '0' },
                        { '1', '1', '0', '1', '0' },
                        { '1', '1', '0', '0', '0' },
                        { '0', '0', '0', '0', '0' },
                    },
                    1
                ),
                new Tester<char[][], Integer>(
                    new char[][] {
                        { '1', '1', '0', '0', '0' },
                        { '1', '1', '0', '0', '0' },
                        { '0', '0', '1', '0', '0' },
                        { '0', '0', '0', '1', '1' },
                    },
                    3
                ),
                new Tester<char[][], Integer>(
                    new char[][] { { '0', '0', '0', '0', '0' } },
                    0
                )
            )
        );

        testers.forEach(
            tester ->
                assertEquals(
                    tester.answer,
                    new Solution0200().numIslands(tester.question)
                )
        );
    }
}
