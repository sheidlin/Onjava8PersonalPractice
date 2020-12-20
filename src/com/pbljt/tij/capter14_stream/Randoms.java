package com.pbljt.tij.capter14_stream;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 21:11
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
public class Randoms {
    public static void main(String atgs[]) {
        assert false: "123";
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
