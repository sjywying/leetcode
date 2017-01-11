package com.pangdun.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 题目：https://leetcode.com/problems/two-sum/
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * The return format had been changed to zero-based indices.
 *
 * Created by crazyy on 17/1/12.
 */
public class _1_TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSum(nums, 18)));
        System.out.println(Arrays.toString(twoSum(nums, 22)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
