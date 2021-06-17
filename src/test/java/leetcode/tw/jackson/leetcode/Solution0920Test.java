package leetcode.tw.jackson.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import leetcode.tw.jackson.structure.Interval;
import org.junit.jupiter.api.Test;

public class Solution0920Test {

    @Test
    public void testSuccessCases() {
        List<Interval> tester = new ArrayList<>(
            Arrays.asList(
                new Interval(0, 30),
                new Interval(5, 19),
                new Interval(15, 20)
            )
        );
        assertEquals(false, new Solution0920().canAttendMeetings(tester));
    }
}
