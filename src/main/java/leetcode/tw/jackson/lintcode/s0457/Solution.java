package leetcode.tw.jackson.lintcode.s0457;

public class Solution {

    public int findPosition(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        if (nums == null || nums.length == 0) {
            return -1;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (nums[left] == target) {
            return left;
        }

        return -1;
    }
}
