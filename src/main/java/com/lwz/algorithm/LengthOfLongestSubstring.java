package com.lwz.algorithm;

/*
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * 示例：
 * 给定 "abcaebcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 */

import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstring {

    public static void main(String[] args){
        String str="12342568797";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String msg) {
        int flag = 0;
        List<Character> list = new ArrayList<>(msg.length());
        char[] data = msg.toCharArray();
        for (int i = 0; i < data.length; i++) {
            if(list.contains(data[i])){
                if(list.size() > flag){
                    flag = list.size();
                }
                int index = list.indexOf(data[i]);
                for (int j = 0; j <= index; j++) {
                    list.remove(0);
                }
            }
            list.add(data[i]);
        }
        if(list.size() > flag){
            flag = list.size();
        }
        return flag;
    }
}
