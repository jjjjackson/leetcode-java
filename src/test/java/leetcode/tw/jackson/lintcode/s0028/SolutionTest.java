package leetcode.tw.jackson.lintcode.s0028;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

class Input {

    int[][] nums;
    int target;

    public Input(int[][] nums, int target) {
        this.nums = nums;
        this.target = target;
    }
}

public class SolutionTest {

    @Test
    public void givenByQuestion() {
        List<Tester<Input, Boolean>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<Input, Boolean>(
                    new Input(
                        new int[][] {
                            { 1, 3, 5, 7 },
                            { 10, 11, 16, 20 },
                            { 23, 30, 34, 50 },
                        },
                        3
                    ),
                    true
                ),
                new Tester<Input, Boolean>(
                    new Input(new int[][] { { 5 } }, 2),
                    false
                )
            )
        );

        testers.forEach(
            tester -> {
                assertEquals(
                    tester.answer,
                    new Solution()
                    .searchMatrix(tester.question.nums, tester.question.target)
                );
            }
        );
    }
}
