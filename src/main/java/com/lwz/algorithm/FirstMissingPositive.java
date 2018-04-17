package com.lwz.algorithm;

/*
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 */

import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) throws Exception {
        int[] nums={-1,0,1,2};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) throws Exception {
        if(nums == null || nums.length == 0){
            throw new Exception("参数无效，数组为空");
        }

        Arrays.sort(nums);
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] <= 0){
                continue;
            }
            if(nums[i] == min){
                min ++;
            }
            if(nums[i] > min){
                return min;
            }
        }
        return min;
    }
}
