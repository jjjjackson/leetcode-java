package leetcode.tw.jackson.leetcode;

import java.util.*;

// https://leetcode.com/problems/shortest-path-in-binary-matrix/
// BFS 找最短路徑

class Point {

    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point other = (Point) obj;
        return x == other.getX() && y == other.getY();
    }

    @Override
    public String toString() {
        return "( " + x + " , " + y + " )";
    }
}

public class Solution1091 {

    int[][] grid;
    Point[] directions = {
        new Point(-1, 1),
        new Point(-1, 0),
        new Point(-1, -1),
        new Point(0, 1),
        new Point(0, -1),
        new Point(1, 1),
        new Point(1, 0),
        new Point(1, -1),
    };

    Point topLeft;
    Point buttonRight;

    private int getValue(Point point) {
        return grid[point.getX()][point.getY()];
    }

    private boolean isInRange(Point point) {
        return (
            topLeft.getX() <= point.getX() &&
            topLeft.getY() <= point.getY() &&
            buttonRight.getX() >= point.getX() &&
            buttonRight.getY() >= point.getY()
        );
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        /**
         * @param grid: an 2D array of Matrix
         * @return: the steps from topLeft to buttonRight
         */

        if (grid == null) {
            return 0;
        }

        this.grid = grid;
        topLeft = new Point(0, 0);
        buttonRight = new Point(grid.length - 1, grid[0].length - 1);

        if (getValue(topLeft) == 1) {
            return -1;
        }
        if (getValue(buttonRight) == 1) {
            return -1;
        }

        int layer = 0;
        Deque<Point> queue = new ArrayDeque<>();
        queue.offerLast(topLeft);

        while (queue.size() != 0) {
            layer++;
            int size = queue.size();

            while (size > 0) {
                size--;
                Point next = queue.pollFirst();

                if (getValue(next) == 1) {
                    continue;
                }

                if (next.equals(buttonRight)) {
                    return layer;
                }

                grid[next.getX()][next.getY()] = 1;

                for (Point d : directions) {
                    Point neighbor = new Point(
                        next.getX() + d.getX(),
                        next.getY() + d.getY()
                    );

                    if (!isInRange(neighbor)) {
                        continue;
                    }

                    queue.offerLast(neighbor);
                }
            }
        }

        return -1;
    }
}
