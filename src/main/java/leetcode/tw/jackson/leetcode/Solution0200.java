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
