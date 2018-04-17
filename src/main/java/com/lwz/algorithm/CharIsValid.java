package com.lwz.algorithm;

/*
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CharIsValid {
    private static Map<Character, Integer> dataSrc = new HashMap<>();

    static {
        dataSrc.put('(', 1);
        dataSrc.put(')', -1);
        dataSrc.put('{', 2);
        dataSrc.put('}', -2);
        dataSrc.put('[', 3);
        dataSrc.put(']', -3);
    }

    public static void main(String[] args) {
        String str = "";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if (StringUtils.isEmpty(s)) {
            return true;
        }

        char[] items = s.toCharArray();
        Stack<Integer> stack = new Stack<Integer>();
        for (char item : items) {
            if (stack.empty()) {
                stack.push(dataSrc.get(item));
            } else {
                if (stack.peek() * -1 == dataSrc.get(item)) {
                    stack.pop();
                } else {
                    stack.push(dataSrc.get(item));
                }
            }
        }
        if (stack.empty()) {
            return true;
        }
        return false;
    }
}
