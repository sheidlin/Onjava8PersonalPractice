package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/15 16:38
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

class CallCenter {
    static void call(String tel, int money) {
        System.out.println("telephone " + tel + " cost "+ money);
    }
    static void call(int money, String tel) {
        System.out.println("cost "+ money + " to call telephone " + tel);
    }
}
public class OverloadingOrder {
    public static void main(String args[]) {
        CallCenter.call(1,"86553104");
        CallCenter.call("86553104",1);
    }
}
