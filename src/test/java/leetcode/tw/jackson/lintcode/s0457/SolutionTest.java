package leetcode.tw.jackson.lintcode.s0457;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

class Input {

    int[] nums;
    int target;

    public Input(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }
}

public class SolutionTest {

    @Test
    public void givenByQuestion() {
        List<Tester<Input, int[]>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<Input, int[]>(
                    new Input(new int[] { 1, 2, 2, 4, 5, 5 }, 2),
                    new int[] { 1, 2 }
                ),
                new Tester<Input, int[]>(
                    new Input(new int[] { 1, 2, 2, 4, 5, 5 }, 6),
                    new int[] { -1 }
                ),
                new Tester<Input, int[]>(
                    new Input(new int[] { 1, 2, 2, 4, 6, 6 }, 5),
                    new int[] { -1 }
                )
            )
        );

        testers.forEach(
            tester -> {
                int result = new Solution()
                .findPosition(tester.question.nums, tester.question.target);
                assertTrue(
                    Arrays.stream(tester.answer).anyMatch(i -> i == result)
                );
            }
        );
    }
}
