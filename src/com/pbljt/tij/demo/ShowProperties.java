package com.pbljt.tij.demo;

/**
 * @author :ljt
 * @date :Created in 2020/12/15 13:28
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
public class ShowProperties {
    public static void main(String args[]) {
        System.out.println(System.getProperty("user.name"));
        //PrintStream out
        System.getProperties().list(System.out);
    }
}
