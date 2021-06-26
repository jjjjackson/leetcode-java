package leetcode.tw.jackson.leetcode;

public class Solution0070 {

    public int climbStairs(int n) {
        // f[n] = f[n-1] + f[n-2]
        // f[0] = 1
        // f[1] = 1
        // f[2] = 1 + 1 = 2
        // f[3] = 1 + 2

        if (n < 2) {
            return 1;
        }

        int prev = 1;
        int prevprev = 1;

        for (int i = 2; i <= n; i++) {
            int current = prev + prevprev;
            prevprev = prev;
            prev = current;
        }

        return prev;
    }
}
