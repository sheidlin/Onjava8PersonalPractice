package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/16 22:43
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
public class PrimitiveOverloading {
    void f1(int x) {
        System.out.print("f1(int)");
    }
    public static void main(String args[]) {
        char c = 'c';
        new PrimitiveOverloading().f1(c);
    }
}
