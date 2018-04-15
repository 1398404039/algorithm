package com.lwz.algorithm;

import org.springframework.util.StringUtils;

public class StrMatch {

    public static void main(String[] args) {
        String str1 = "123456789";
        String str2 = "345678922";
        System.out.println(indexOf(str1, str2));
    }

    public static int strStr(String haystack, String needle) {
        if (needle == null) {
            return -1;
        }
        if ("".equals(needle)) {
            return 0;
        }
        return haystack.indexOf(needle);
    }


    public static int indexOf(String haystack, String needle) {
        if (StringUtils.isEmpty(needle)) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            String temp = haystack.substring(i, i + needle.length());
            if (temp.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
