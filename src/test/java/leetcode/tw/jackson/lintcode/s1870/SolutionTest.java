package leetcode.tw.jackson.lintcode.s1870;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Tester;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void givenByQuestion() {
        List<Tester<String, Integer>> testers = new ArrayList<>(
            Arrays.asList(
                new Tester<String, Integer>("00010011", 9),
                new Tester<String, Integer>("010010", 5)
            )
        );

        testers.forEach(
            tester -> {
                assertEquals(
                    tester.answer,
                    new Solution().stringCount(tester.question)
                );
            }
        );
    }
}
