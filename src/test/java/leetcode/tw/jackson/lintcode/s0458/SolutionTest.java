package leetcode.tw.jackson.lintcode.s0458;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        List<Tester<Input, Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<Input, Integer>(
                    new Input(new int[] { 1, 2, 2, 4, 5, 5 }, 2),
                    2
                ),
                new Tester<Input, Integer>(
                    new Input(new int[] { 1, 2, 2, 4, 5, 5 }, 6),
                    -1
                )
            )
        );

        testers.forEach(
            tester -> {
                assertEquals(
                    tester.answer,
                    new Solution()
                    .lastPosition(tester.question.nums, tester.question.target)
                );
            }
        );
    }
}
