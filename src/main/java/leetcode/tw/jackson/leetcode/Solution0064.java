package leetcode.tw.jackson.leetcode;

//BFS 或 DP 都可以解
// DP => f[x,y] = min{ f[x-1,y], f[x, y-1] } + grid[x][y]
// Boundary => f[0,0] = grid[0][0]
// Boundary => x-1 || y-1 <0 => take another
// 可以用滾動數組優化

public class Solution0064 {

    public int minPathSum(int[][] grid) {
        if (grid.length <= 0 || grid[0].length <= 0) {
            return 0;
        }

        int lenX = grid.length;
        int lenY = grid[0].length;

        int[][] dp = new int[lenX][lenY];

        for (int x = 0; x < lenX; x++) {
            for (int y = 0; y < lenY; y++) {
                if (x == 0 && y == 0) {
                    dp[0][0] = grid[0][0];
                    continue;
                }

                if (x - 1 < 0) {
                    dp[x][y] = dp[x][y - 1] + grid[x][y];
                    continue;
                }

                if (y - 1 < 0) {
                    dp[x][y] = dp[x - 1][y] + grid[x][y];
                    continue;
                }

                dp[x][y] = grid[x][y] + Math.min(dp[x - 1][y], dp[x][y - 1]);
            }
        }

        return dp[lenX - 1][lenY - 1];
    }
}
