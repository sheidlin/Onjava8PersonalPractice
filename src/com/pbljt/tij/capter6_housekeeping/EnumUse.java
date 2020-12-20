package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/16 22:35
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
public class EnumUse {
    public static void main(String args[]){
        for(Spiciness spiciness : Spiciness.values()) {
            System.out.println(spiciness.ordinal() + " : " + spiciness);
        }
    }
}
