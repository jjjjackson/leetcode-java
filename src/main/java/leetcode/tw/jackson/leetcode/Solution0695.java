package leetcode.tw.jackson.leetcode;

import java.util.*;

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

public class Solution0695 {

    private int[][] grid;
    private Coordinate[] directions = {
        new Coordinate(0, 1),
        new Coordinate(0, -1),
        new Coordinate(1, 0),
        new Coordinate(-1, 0),
    };

    private int getValueInGrid(Coordinate coordinate) {
        return grid[coordinate.getX()][coordinate.getY()];
    }

    private boolean isOutOfArea(Coordinate coordinate) {
        return (
            coordinate.getX() < 0 ||
            coordinate.getY() < 0 ||
            coordinate.getX() >= grid.length ||
            coordinate.getY() >= grid[(grid.length) - 1].length
        );
    }

    private int areaOfIsland(int[][] grid, Coordinate from) {
        int area = 0;

        Deque<Coordinate> stack = new ArrayDeque<>();
        stack.offerLast(new Coordinate(from.getX(), from.getY()));

        while (stack.size() > 0) {
            Coordinate node = stack.pollLast();

            if (isOutOfArea(node)) {
                continue;
            }

            if (getValueInGrid(node) == 0) {
                continue;
            }

            grid[node.getX()][node.getY()] = 0;
            area++;

            for (Coordinate d : directions) {
                stack.offerLast(
                    new Coordinate(
                        d.getX() + node.getX(),
                        d.getY() + node.getY()
                    )
                );
            }
        }

        return area;
    }

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    result =
                        Math.max(
                            result,
                            areaOfIsland(grid, new Coordinate(i, j))
                        );
                }
            }
        }

        return result;
    }
}
