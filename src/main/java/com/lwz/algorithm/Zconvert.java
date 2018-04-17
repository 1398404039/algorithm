package com.lwz.algorithm;
/*
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数 ：
   P   A   H   N
   A P L S I I G
   Y   I   R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 */
public class Zconvert {
    public static void main(String[] args) {
        String msg ="0123456789";
        int flag = 5;
        System.out.println(convert(msg,flag));
    }

    public static String convert(String s, int numRows) {
        char[] data = s.toCharArray();
        int a = (s.length()/(2*(numRows-1))) * (numRows-1);
        int b = s.length() % (2 * (numRows - 1));
        b = b <= numRows ? 1 : b - numRows;
        char[][] result = new char[numRows][a+b];

        int length = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i < data.length; i+=2 * numRows - 2) {
            for (int j = 0; j < numRows; j++) {
                if(length >= data.length){
                    break;
                }
                result[y][x] = data[length];
                y ++;
                length ++;
            }
            y --;
            for (int j = 0; j < numRows - 2; j++) {
                if(length >= data.length){
                    break;
                }
                y --;
                x ++;
                result[y][x] = data[length];
                length ++;
            }
            y = 0;
            x ++;
        }
        StringBuilder finalStr = new StringBuilder();
        for (int i = 0; i < result.length ; i++) {
            for (int j = 0; j < result[i].length; j++) {
                finalStr.append(result[i][j]);
            }
        }
        if(finalStr.length() > 0){
            return finalStr.toString();
        }
        return null;
    }
}
