package com.lwz.algorithm;

/**
 * 有效数字
 * 验证给定的字符串是否为数字。

 例如:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true

 说明: 我们有意将问题陈述地比较模糊。在实现代码之前，你应当事先思考所有可能的情况。
 * Created by Administrator on 2018/4/25 0025.
 */
public class IsNumber {
    public static void main(String[] args){
        String str="21.2f";
        System.out.print(isNumber(str));
    }

    public static boolean isNumber(String s){
        try{
            Double.valueOf(s);
        }catch (Exception ex){
            return false;
        }
        if(s.contains("f") || s.contains("F") || s.contains("d") || s.contains("D") || s.contains("x") || s.contains("X")){
            return false;
        }
        return true;
    }
}
