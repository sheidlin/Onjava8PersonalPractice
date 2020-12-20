package com.pbljt.tij.capter19_typeinfo;

import java.util.stream.Stream;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 23:43
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
public class BoundedClassReferences {
    public static void main(String args[]) {
        Class<? extends Number> numberClass = int.class;
        numberClass = Double.class;
//        numberClass = String.class; 非法！
    }
}
