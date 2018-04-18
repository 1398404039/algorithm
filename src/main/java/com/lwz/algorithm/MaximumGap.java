package com.lwz.algorithm;

/*
 *  给定一个无序的数组，找出数组在排序后相邻的元素之间最大的差值。
    尽量尝试在线性时间和空间复杂度情况下解决此问题。
    若数组元素个数少于2，则返回0。
    假定所有的元素都是非负整数且范围在32位有符号整数范围内。
 */

import java.util.Arrays;

public class MaximumGap {
    public static void main(String[] args){

    }

    public static int maximumGap(int[] nums){
        if(nums == null || nums.length < 2){
            return 0;
        }
        Arrays.sort(nums);
        int maxDiff=0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1];
            if(diff > maxDiff){
                maxDiff = diff;
            }
        }
        return maxDiff;
    }
}
