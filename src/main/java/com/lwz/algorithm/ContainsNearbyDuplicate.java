package com.lwz.algorithm;

import java.util.Map;
import java.util.TreeMap;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使 nums [i] = nums [j]，并且 i 和 j 的绝对差值最大为 k
 * Created by Administrator on 2018/4/20 0020.
 */
public class ContainsNearbyDuplicate {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,1,75,45,12,85,62};
        int flag = 8;
        System.out.print(containsNearbyDuplicate(array,flag));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return false;
        }
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])){
                int res = i - map.get(nums[i]);
                res = res > 0 ? res : res * -1;
                if(res <=  k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
