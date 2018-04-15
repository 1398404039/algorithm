package com.lwz.algorithm;

/*
* 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
* 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
* 示例:
  输入："23"
  输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
* */
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    private static Map<Character,String[]> getDataSrc() {
        Map<Character,String[]> dataSrc = new HashMap<>();
        String[] item1 = {"a","b","c"};
        String[] item2 = {"d","e","f"};
        String[] item3 = {"g","h","i"};
        String[] item4 = {"j","k","l"};
        String[] item5 = {"m","n","o"};
        String[] item6 = {"p","q","r","s"};
        String[] item7 = {"t","u","v"};
        String[] item8 = {"w","x","y","z"};
        dataSrc.put('2',item1);
        dataSrc.put('3',item2);
        dataSrc.put('4',item3);
        dataSrc.put('5',item4);
        dataSrc.put('6',item5);
        dataSrc.put('7',item6);
        dataSrc.put('8',item7);
        dataSrc.put('9',item8);
        return dataSrc;
    }
    private  static Map<Character,String[]> dataSrc = getDataSrc();

    public static void main(String[] args){
        String digits = "234";
        letterCombinations(digits);
    }

    public static List<String> letterCombinations(String digits) {
        if(StringUtils.isEmpty(digits)){
            return null;
        }

        char[] phoneNo = digits.toCharArray();
        String[] result = null;
        for (int i = 0; i < phoneNo.length; i++) {
            result = strJoin(result,dataSrc.get(phoneNo[i]));
        }
        List<String> list = Arrays.asList(result);
        return list;
    }
    
    public static String[] strJoin(String[] arr1,String[] arr2){
        if(arr1 == null && arr2 == null){
            return null;
        }
        if(arr1 == null && arr2 != null){
            return arr2;
        }
        if(arr1 != null && arr2 == null){
            return arr1;
        }
        String[] result = new String[arr1.length * arr2.length];
        int index = 0;
        for (String item1 : arr1) {
            for (String item2 : arr2) {
                result[index] = item1+item2;
                index ++;
            }
        }
        return result;
    }

}
