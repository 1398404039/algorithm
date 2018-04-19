package com.lwz.algorithm;

/*
 * 求众数
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且数组中的众数永远存在。
 */
import java.util.Arrays;

public class MajorityElement {
    public static void main() throws Exception {
        int[] array = {1};
        System.out.println(majorityElement(array));
    }

    public static int majorityElement(int[] nums) throws Exception {
        if(nums == null && nums.length == 0){
            throw new Exception("参数序列为空，不合法");
        }
        Arrays.sort(nums);
        int index = nums.length % 2 == 0 ? (nums.length / 2 - 1) : (nums.length / 2);
        return nums[index];
    }
}
