package leetcode.tw.jackson.lintcode.s0036;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import leetcode.tw.jackson.structure.ListNode;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

class Input {

    int[] numbers;
    int m;
    int n;

    public Input(int[] numbers, int m, int n) {
        this.numbers = numbers;
        this.m = m;
        this.n = n;
    }
}

public class SolutionTest {

    @Test
    public void testGivenByQuestion() {
        List<Tester<Input, int[]>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<Input, int[]>(
                    new Input(new int[] { 1, 2, 3, 4, 5 }, 2, 4),
                    new int[] { 1, 4, 3, 2, 5 }
                ),
                new Tester<Input, int[]>(
                    new Input(new int[] { 1, 2, 3, 4 }, 2, 3),
                    new int[] { 1, 3, 2, 4 }
                )
            )
        );

        testers.forEach(
            tester -> {
                var head = ListNode.createList(tester.question.numbers);
                var resultHead = new Solution()
                .reverseBetween(head, tester.question.m, tester.question.n);
                var result = ListNode.listToArray(resultHead);
                assertArrayEquals(tester.answer, result);
            }
        );
    }
}
