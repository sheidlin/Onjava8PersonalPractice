package com.pbljt.tij.capter7_inner;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 12:53
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */


public class DotThis {
    public class Inner {
        public DotThis getOuter() {
            return DotThis.this;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String args[]) {
        DotThis dotThis1 = new DotThis();
        DotThis.Inner inner1 = dotThis1.getInner();
        DotThis dotThis2 = inner1.getOuter();
        System.out.println(dotThis1 == dotThis2);

        DotThis.Inner inner3 = dotThis1.new Inner();
        DotThis dotThis3 = inner3.getOuter();
        System.out.println(dotThis1 == dotThis3);
    }
}
