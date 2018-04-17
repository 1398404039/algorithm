package com.lwz.algorithm;

/*
 * 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
   示例:
   输入: "Hello World"
   输出: 5
 */
import org.springframework.util.StringUtils;

public class LengthOfLastWord {
    public static void main(String[] args){
        String str = "Hello World             ";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String str){
        if(StringUtils.isEmpty(str)){
            return 0;
        }
        String[] data = str.split(" ");
        String item = data[data.length - 1];
        return item.length();
    }
}
