package leetcode.tw.jackson.lintcode.s0521;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void givenByQuestion() {
        List<Tester<int[], Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<int[], Integer>(new int[] { 1, 3, 1, 4, 4, 2 }, 4),
                new Tester<int[], Integer>(new int[] { 1, 2, 3 }, 3)
            )
        );

        testers.forEach(
            tester -> {
                assertEquals(
                    tester.answer,
                    new Solution().deduplication(tester.question)
                );
            }
        );
    }
}
