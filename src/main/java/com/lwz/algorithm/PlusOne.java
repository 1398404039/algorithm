package com.lwz.algorithm;

/*
 * 加一
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 * 可以假设整数不包含任何前导零，除了数字0本身。
 * 示例 1:
   输入: [1,2,3]
   输出: [1,2,4]
   解释: 输入数组表示数字 123。
 */
public class PlusOne {
    public static void main(String[] args){
        int[] array={9,9,9};
        int[] array1 = plusOne(array);
        for (int item : array1) {
            System.out.println(item);
        }
    }

    public static int[] plusOne(int[] digits){
        if(digits == null && digits.length == 0){
            return null;
        }
        StringBuilder num = new StringBuilder();
        for (int item : digits) {
            num.append(String.valueOf(item));
        }
        String numStr = String.valueOf(Integer.valueOf(num.toString())+1);
        int[] array = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            array[i] = Integer.valueOf(numStr.substring(i,i+1));
        }
        return array;
    }
}
