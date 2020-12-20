package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/16 10:39
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

class Computer {
    private String name;
    private boolean on;
    private boolean rebooting;

    public Computer(String name, boolean on) {
        this.name = name;
        this.on = on;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}

public class UsingFinalize {



}
