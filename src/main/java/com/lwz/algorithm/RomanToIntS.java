package com.lwz.algorithm;

import java.util.Scanner;

/**
 * 罗马数字转整数
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。
    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
 * Created by Administrator on 2018/4/21 0021.
 */
public class RomanToIntS {
    public static int romanToInt(String s) {

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i > -1; i--) {
            switch (s.charAt(i)) {
                case 'I': // 1
                    if (1 < prev) {
                        result -= 1;
                    } else {
                        result += 1;

                    }
                    prev = 1;
                    break;

                case 'V': // 5

                    if (5 < prev) {
                        result -= 5;
                    } else {
                        result += 5;
                    }

                    prev = 5;

                    break;
                case 'X': // 10
                    if (10 < prev) {
                        result -= 10;
                    } else {
                        result += 10;
                    }

                    prev = 10;
                    break;
                case 'L': // 50
                    if (50 < prev) {
                        result -= 50;
                    } else {
                        result += 50;
                    }

                    prev = 50;
                    break;
                case 'C': // 100
                    if (100 < prev) {
                        result -= 100;
                    } else {
                        result += 100;
                    }

                    prev = 100;
                    break;
                case 'D': // 500
                    if (500 < prev) {
                        result -= 500;
                    } else {
                        result += 500;
                    }

                    prev = 500;
                    break;
                case 'M': // 1000
                    result += 1000;
                    prev = 1000;
                    break;
            }
        }

        return result;
    }


    public  static void main(String[] args){
        System.out.println("输出的结果为："+romanToInt("LVIII)"));
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String[][]r = {
                {"","I","II","III","IV","V","VI","VII","VIII","IX"},
                {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"},
                {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"},
                {"","M","MM","MMM"}
        };

        int n = sc.nextInt();
        sb.append(r[3][n/1000%10]);
        sb.append(r[2][n/100%10]);
        sb.append(r[1][n/10%10]);
        sb.append(r[0][n%10]);
        System.out.println(sb);

    }
}
