package com.lwz.algorithm;


import java.util.Arrays;

/*
* 合并两个有序数组，拉链算法(从小到大)
*/
public class MergeOrderedArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 6, 5, 8, 3, 4};
        int[] arr2 = {7, 9, 2,15,2,9};
        mergeArray(arr1, arr2);
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return null;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int[] array = new int[arr1.length + arr2.length];
        int index = 0;
        int index1 = 0;
        int index2 = 0;

        while (index < array.length) {
            if (arr1[index1] <= arr2[index2]) {
                array[index] = arr1[index1];
                index1 ++;
            } else {
                array[index] = arr2[index2];
                index2 ++;
            }
            index++;
            System.out.println(index+"--"+index1+"--"+index2);
            if(index1 == arr1.length && index2 < arr2.length){
                System.arraycopy(arr2,index2,array,index,arr2.length-index2);
                index = array.length;
            }
            if(index2 == arr2.length && index1 < arr1.length){
                System.arraycopy(arr1,index1,array,index,arr1.length-index1);
                index = array.length;
            }
        }
        return array;
    }
}
