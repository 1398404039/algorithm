package com.lwz.algorithm;

/*
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        if(nums == null){
            return null;
        }
        int[] result = {0,0};
        List<Integer> list = new ArrayList(nums.length);
        for(int item : nums){
            list.add(item);
        }
        Arrays.sort(nums);
        for (int i = 0;i < nums.length && nums[i] < target;i ++ ) {
            for (int j = i+1;j < nums.length  && nums[j] < target;j++ ) {
                if(nums[i] + nums[j] == target){
                    result[0] = list.indexOf(nums[i]);
                    result[1] = list.indexOf(nums[j]);
                    break;
                }
                if(nums[i] + nums[j] > target){
                    break;
                }
            }
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args){
        int[] arr = {2,7,11,15};
        int flag = 9;

        int[] res = twoSum(arr,flag);
        for (int item:res) {
            System.out.println(item);
        }
    }
}
