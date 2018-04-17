package com.lwz.algorithm;

/*
 * 只出现一次的数字
 * 给定一个整数数组，除了某个元素外其余元素均出现两次。请找出这个只出现一次的元素。
 */

import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args){
        int[] arr1 = {1,1,2,2,3};
        int[] arr2 = {1,2,3,4,3,2,1};
        int[] arr3 = {1,1,3,2,2};
        System.out.println(singleNumber(arr1));
        System.out.println(singleNumber(arr2));
        System.out.println(singleNumber(arr3));
    }

    public static int singleNumber(int[] nums){
        if(nums == null && nums.length ==0){
            return -1;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i+=2) {
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
