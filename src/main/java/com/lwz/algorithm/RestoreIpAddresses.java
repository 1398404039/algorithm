package com.lwz.algorithm;

import java.util.ArrayList;
import java.util.List;

public class RestoreIpAddresses {
    private static int IP_MAXVALUE = 255;
    private static String FLAG = ".";
    private static String IP_STR = null;
    private static List<String> resList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public static List<String> restoreIpAddresses(String strIp) {
        char[] data = strIp.toCharArray();

        return null;
    }

    public void test(String ip) {
        IP_STR = ip;
        resList.clear();
        switch (ip.length()) {
            case 4:
                strLength4();
                break;
            case 5:
                strLength5();
                break;
            case 6:
                strLength6();
                break;
            case 7:
                strLength7();
                break;
            case 8:
                strLength8();
                break;
            case 9:
                strLength9();
                break;
            case 10:
                strLength10();
                break;
            case 11:
                strLength11();
                break;
            case 12:
                strLength12();
                break;
        }
    }

    public void strLength4(){
        String ipAdd = IP_STR.substring(0,1)+ FLAG + IP_STR.substring(1,2)+ FLAG + IP_STR.substring(2,3)+ FLAG + IP_STR.substring(3,4);
        resList.add(ipAdd);
    }
    public void strLength5(){
    }
    public void strLength6(){
    }
    public void strLength7(){
    }
    public void strLength8(){
    }
    public void strLength9(){
    }
    public void strLength10(){
    }
    public void strLength11(){
    }
    public void strLength12(){
        String ipAdd = IP_STR.substring(0,3)+ FLAG + IP_STR.substring(3,6)+ FLAG + IP_STR.substring(6,9)+ FLAG + IP_STR.substring(9,12);
        resList.add(ipAdd);
    }
}
