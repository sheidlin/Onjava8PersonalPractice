package com.pbljt.tij.capter7_inner;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 19:19
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
class WithInner {
    class Inner {}
}
public class InheritInner extends WithInner.Inner {
    //- InheritInner() {} // Won't compile
    InheritInner(WithInner wi) {
        wi.super();
    }
    public static void main(String[] args) {
        WithInner wi = new WithInner();
        InheritInner ii = new InheritInner(wi);
    }
}