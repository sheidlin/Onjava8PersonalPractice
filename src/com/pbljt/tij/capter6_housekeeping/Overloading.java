package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/15 15:00
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
class Tree {
    private int height;

    public Tree() {
        System.out.println("This is a seed");
        height = 0;
    }

    public Tree(int height) {
        this.height = height;
        System.out.println("This is a tree of" + height + "height");
    }

    void info () {
        System.out.println("Tree's tall: "+height);
    }

    void info (String info) {
        System.out.print(info+" ");
        info();
    }
}
public class Overloading {
    public static void main(String args[]) {
        for(int i = 0; i <= 5; i++) {
            Tree tree = (i==0) ? new Tree() : new Tree(i);
            tree.info();
            tree.info("overload");
        }
    }
}
