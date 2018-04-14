package com.lwz.algorithm;


/*
* 给定一个 32 位有符号整数，将整数中的数字进行反转。
* 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
* 示例 1:
  输入: 123
  输出: 321
* 示例 2:
  输入: -123
  输出: -321
* 示例 3:
  输入: 120
  输出: 21
*/
public class Reverse {

    public static int reverse(int x) {
        int flag = 1;
        String strRes = String.valueOf(x);
        if(x < 0){
            strRes = strRes.substring(1);
            flag = -1;
        }
        StringBuilder strResult = new StringBuilder();
        for (int i = strRes.length(); i > 0; i--) {
            String temp = strRes.substring(i-1,i);
            strResult.append(temp);
        }
        if(strResult.length() == 0 ){
            return 0;
        }
        long result = Long.valueOf(strResult.toString());
        return getFinalNum(result) * flag;
    }


    public static int getFinalNum(long x){
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }
        return Integer.valueOf(String.valueOf(x));
    }

    public static void main(String[] args){
        int num =120;
        System.out.println(reverse(num));
    }
}
