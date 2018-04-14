package com.lwz.algorithm;

/*
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * 请找出这两个有序数组的中位数。
 *
 * 示例 1:
   nums1 = [1, 3]
   nums2 = [2]
   中位数是 2.0
 * 示例 2:
   nums1 = [1, 2]
   nums2 = [3, 4]
   中位数是 (2 + 3)/2 = 2.5
 */

import java.util.Arrays;

public class MedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length+ nums2.length];
        System.arraycopy(nums1,0,array,0,nums1.length);
        System.arraycopy(nums2,0,array,nums1.length,nums2.length);
        Arrays.sort(array);
        int length = array.length;
        if(length % 2 > 0){
            return array[(length+1)/2 - 1];
        }
        double flag1 = array[length / 2 - 1];
        double flag2 = array[length / 2];
        return (flag1 + flag2) / 2;
    }


    public static void main(String[] args){
        int[] num1={1,2};
        int[] num2={3,5,9,7,11};
        System.out.println(findMedianSortedArrays(num1,num2));
    }
}
