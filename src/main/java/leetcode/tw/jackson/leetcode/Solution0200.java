package leetcode.tw.jackson.leetcode;

// https://leetcode.com/problems/number-of-islands/description/
// 用 DFS 或 BFS 看是不是同一個 Island
// 然後總共有幾個 Island
// 這裡用 DFS

import java.util.*;

public class Solution0200 {

    class Coordinate {

        private int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    char[][] grid;
    private final char SEA = '0';
    private final char ISLAND = '1';

    private final Coordinate[] directions = {
        new Coordinate(0, 1),
        new Coordinate(0, -1),
        new Coordinate(1, 0),
        new Coordinate(-1, 0),
    };

    public int numIslands(char[][] grid) {
        int numberOfIslands = 0;
        this.grid = grid;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ISLAND) {
                    exploreIslands(new Coordinate(i, j));
                    numberOfIslands++;
                }
            }
        }

        return numberOfIslands;
    }

    private void exploreIslands(Coordinate from) {
        Deque<Coordinate> stack = new ArrayDeque<>();
        stack.offerLast(from);

        while (stack.size() > 0) {
            Coordinate coord = stack.pollLast();

            if (isOutOfGrid(coord)) {
                continue;
            }
            if (grid[coord.getX()][coord.getY()] == SEA) {
                continue;
            }

            grid[coord.getX()][coord.getY()] = SEA;
            for (Coordinate d : directions) {
                stack.offerLast(
                    new Coordinate(
                        d.getX() + coord.getX(),
                        d.getY() + coord.getY()
                    )
                );
            }
        }
    }

    private boolean isOutOfGrid(Coordinate coord) {
        return (
            coord.getX() < 0 ||
            coord.getY() < 0 ||
            coord.getX() >= grid.length ||
            coord.getY() >= grid[(grid.length) - 1].length
        );
    }
}
// class Solution2 {
//     int[][] directions = {
//         {1,0},
//         {-1,0},
//         {0,1},
//         {0,-1},
//     };
//     private void exploreIsland(char[][] grid, boolean[][] visited, int[] current ) {
//         if(current[0] < 0 || current[0] >= grid.length || current[1] < 0 || current[1] >= grid[0].length) {
//             return;
//         }
//         if( grid[current[0]][current[1]] == '0' || visited[current[0]][current[1]] ){
//             return;
//         }
//         visited[current[0]][current[1]] = true;
//         for(int[] d: directions){
//             int nextX = d[0] + current[0];
//             int nextY = d[1] + current[1];
//             exploreIsland(grid, visited, new int[]{nextX,nextY});
//         }
//         return;
//     }
//     public int numIslands(char[][] grid) {
//         // dfs
//         if (grid == null ||  grid.length == 0 || grid[0] == null || grid[0].length == 0 ) {
//             return 0;
//         }
//         boolean[][] visited = new boolean[grid.length][grid[0].length];
//         int result = 0;
//         for(int i = 0 ; i < grid.length ; i++ ){
//             for( int j = 0 ; j < grid[i].length ; j++ ){
//                 if(grid[i][j] == '1' && !visited[i][j]) {
//                     exploreIsland(grid, visited, new int[]{i,j});
//                     result++;
//                 }
//             }
//         }
//         return result;
//     }
// }
// class Solution_BFS {
//     int[][] directions = {
//         {1,0},
//         {-1,0},
//         {0,1},
//         {0,-1},
//     };
//     private void exploreIsland(char[][] grid, boolean[][] visited, int[] point ){
//         Queue<int[]> queue = new LinkedList<>();
//         queue.offer(point);
//         int size = 0;
//         while(!queue.isEmpty()) {
//             size = queue.size();
//             while(size > 0) {
//                 size--;
//                 int[] cur = queue.poll();
//                 if(cur[0] < 0 || cur[0] >= grid.length || cur[1] < 0 || cur[1] >= grid[0].length) {
//                     continue;
//                 }
//                 if(grid[cur[0]][cur[1]] == '0' || visited[cur[0]][cur[1]] ) {
//                     continue;
//                 }
//                 visited[cur[0]][cur[1]] = true;
//                 for(int[] d: directions) {
//                     queue.offer(new int[] {
//                        cur[0] + d[0],
//                        cur[1] + d[1],
//                     });
//                 }
//             }
//         }
//         return;
//     }
//     public int numIslands(char[][] grid) {
//         // bfs
//         if (grid == null ||  grid.length == 0 || grid[0] == null || grid[0].length == 0 ) {
//             return 0;
//         }
//         boolean[][] visited = new boolean[grid.length][grid[0].length];
//         int result = 0;
//         for(int i = 0 ; i < grid.length ; i++ ){
//             for( int j = 0 ; j < grid[i].length ; j++ ){
//                 if(grid[i][j] == '1' && !visited[i][j]) {
//                     exploreIsland(grid, visited, new int[]{i,j});
//                     result++;
//                 }
//             }
//         }
//         return result;
//     }
// }
