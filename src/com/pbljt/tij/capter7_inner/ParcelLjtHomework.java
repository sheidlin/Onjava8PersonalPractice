package com.pbljt.tij.capter7_inner;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 15:58
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

interface HomeWork {
    void judge();
}

class PersonLu {
    private String name;
    class LuHomework implements HomeWork {
        @Override
        public void judge() {
            System.out.println("Lu's Homework, brilliant!");
        }
    }
    HomeWork getHomework() {
        return new LuHomework();
    }
}

public class ParcelLjtHomework {
    public static void main(String args[]) {
        PersonLu ljt = new PersonLu();
        HomeWork ljtHomework= ljt.getHomework();
        ljtHomework.judge();
    }
}
