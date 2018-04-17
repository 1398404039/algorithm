package com.lwz.algorithm;

/*
* 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
*/
public class MyPow {
    public static void main(String[] args) throws Exception {
        double x = 2.0;
        int n = -2;
        System.out.println(myPow(x,n));
    }

    public static double myPow(double x,int n) throws Exception {
        if(n < Integer.MIN_VALUE && n > Integer.MAX_VALUE){
            throw new Exception("幂次无效");
        }
        boolean flag = true;
        if(n == 0 && x != 0){
            return 1;
        }
        if(n >0){
            flag = true;
        }else {
            flag =false;
            n = n * -1;
        }
        double sum = 1;
        for (int i = 1; i <= n ; i++) {
            sum = sum * x;
        }
        if(!flag){
            sum = 1/sum;
        }

        return sum;
    }
}
