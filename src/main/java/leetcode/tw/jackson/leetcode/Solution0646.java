package leetcode.tw.jackson.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution0646 {

    public int findLongestChain(int[][] pairs) {
        if (pairs == null || pairs.length <= 1) {
            return pairs.length;
        }

        List<int[]> pairsList = Arrays.asList(pairs);
        pairsList =
            pairsList
                .stream()
                .sorted((a, b) -> a[0] - b[0])
                .collect(Collectors.toList());

        int[] dp = new int[pairs.length];
        for (int i = 0; i < pairs.length; i++) {
            dp[i] = 1;
        }

        for (int i = 1; i < pairsList.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (pairsList.get(j)[1] < pairsList.get(i)[0]) {
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}
