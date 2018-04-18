package com.lwz.algorithm;

/*
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 例如，给出 [100, 4, 200, 1, 3, 2]，这个最长的连续序列是 [1, 2, 3, 4]。返回所求长度： 4。
 * 要求你的算法复杂度为 O(n)。
 */
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args){
        int[] array = {1};
        System.out.println(longestConsecutive(array));
    }

    public static int longestConsecutive(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int length = 1;
        int maxLength = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]  == nums[i + 1]){
                continue;
            }
            if(nums[i] + 1 != nums[i + 1]){
                length = 1;
                continue;
            }
            length ++;
            if(length > maxLength){
                maxLength = length;
            }
        }
        return maxLength;
    }
}
