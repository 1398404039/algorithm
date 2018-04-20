package com.lwz.algorithm;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复,返回true，不存在重复，返回false
 * Created by Administrator on 2018/4/20 0020.
 */
public class ContainDuplicate {
    public static void main(String[] args){
        int[] array = {1,2,};
        System.out.print(containsDuplicate(array));
    }

    public static boolean containsDuplicate(int[] nums){
        if(nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int item: nums) {
            if(set.contains(item)){
                return true;
            }
            set.add(item);
        }
        return false;
    }
}
