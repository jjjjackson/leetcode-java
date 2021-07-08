package leetcode.tw.jackson.lintcode.s0458;

public class Solution {

    public int lastPosition(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length - 1;

        while (left + 1 < right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] > target) {
                right = middle;
            } else {
                left = middle;
            }
        }

        if (nums[right] == target) {
            return right;
        }

        if (nums[left] == target) {
            return left;
        }

        return -1;
    }
}
