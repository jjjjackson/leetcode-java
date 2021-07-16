package leetcode.tw.jackson.lintcode.s0521;

// 去除重复元素 · Remove Duplicate Numbers in Array
// https://www.jiuzhang.com/problem/remove-duplicate-numbers-in-array/

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        Set<Integer> listWithDuplicates = Arrays
            .stream(nums)
            .boxed()
            .collect(Collectors.toSet());

        // for (int i = 0; i < listWithDuplicates.size(); i++) {
        // 題目要求說要改nums
        nums = listWithDuplicates.stream().mapToInt(i -> i).toArray();
        // }

        return listWithDuplicates.size();
    }

    public int deduplication1(int[] nums) {
        List<Integer> list = Arrays
            .stream(nums)
            .boxed()
            .collect(Collectors.toList());
        List<Integer> listWithDuplicates = new ArrayList<>(
            new LinkedHashSet<>(list)
        );

        for (int i = 0; i < listWithDuplicates.size(); i++) {
            // 題目要求說要改nums
            nums[i] = listWithDuplicates.get(i);
        }

        return listWithDuplicates.size();
    }
}
