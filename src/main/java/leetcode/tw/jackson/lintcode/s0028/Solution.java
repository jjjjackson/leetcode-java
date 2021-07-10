package leetcode.tw.jackson.lintcode.s0028;

public class Solution {

    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        if (matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int up = 0, down = matrix.length - 1;
        int locatedRow = 0;
        int left = 0, right = matrix[0].length - 1;

        while (up + 1 < down) {
            int mid = up + (down - up) / 2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                up = mid;
            } else {
                down = mid;
            }
        }

        if (matrix[down][0] <= target) {
            locatedRow = down;
        } else if (matrix[up][0] <= target) {
            locatedRow = up;
        } else {
            return false;
        }

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;
            if (matrix[locatedRow][mid] == target) {
                return true;
            } else if (matrix[locatedRow][mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (matrix[locatedRow][left] == target) {
            return true;
        }
        if (matrix[locatedRow][right] == target) {
            return true;
        }

        return false;
    }
}
