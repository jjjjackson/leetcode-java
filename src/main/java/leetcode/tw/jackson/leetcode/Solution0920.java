package leetcode.tw.jackson.leetcode;

import java.util.*;
import leetcode.tw.jackson.structure.Interval;

public class Solution0920 {

    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a, b) -> a.start - b.start);

        if (intervals.size() <= 1) {
            return true;
        }

        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i - 1).end > intervals.get(i).start) {
                return false;
            }
        }
        return true;
    }
}
