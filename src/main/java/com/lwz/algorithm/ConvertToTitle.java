package com.lwz.algorithm;

/*
 * Excel表列名称
 * 给定一个正整数，返回它在Excel表中相对应的列名称。
 * */

public class ConvertToTitle {
    public static void main(String[] args) {
        // A-Z 65--90
        System.out.println(convertToTitle(27));
    }

    public static String convertToTitle(int n) {
        String title = "";
        while (n > 26) {
            int index = 0;
            if (n % 26 == 0) {
                index = 90;
                n = n / 26 - 1;
            } else {
                index = (n % 26) + 64;
                n = n / 26;
            }
            title = String.valueOf((char) index) + title;
        }
        title = String.valueOf((char) (n + 64)) + title;
        return title;
    }

}
