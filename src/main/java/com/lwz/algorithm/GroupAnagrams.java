package com.lwz.algorithm;

/*
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * 示例:
   输入: ["eat", "tea", "tan", "ate", "nat", "bat"],
   输出:
       [
        ["ate","eat","tea"],
        ["nat","tan"],
        ["bat"]
       ]
 * 说明：
   所有输入均为小写字母。
   不考虑答案输出的顺序。
 */

import org.springframework.util.StringUtils;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> result = groupAnagrams(strs);
        for (String key : result.keySet()) {
            for (String item : result.get(key)) {
                System.out.print(item +"    ");
            }
            System.out.println();
        }
    }

    public static Map<String,List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String item : strs) {
            String key = sortStr(item);
            if(map.containsKey(key)){
                map.get(key).add(item);
                continue;
            }
            List<String> list = new ArrayList<>();
            list.add(item);
            map.put(key,list);
        }
        return map;
    }

    public static String sortStr(String str){
        if(StringUtils.isEmpty(str)){
            return null;
        }
        char[] data = str.toCharArray();
        Arrays.sort(data);
        StringBuilder result = new StringBuilder();
        for (char item : data) {
            result.append(item);
        }
        return result.toString();
    }
}
