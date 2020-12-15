package com.pbljt.tij.chapter4_operators;


/**
 * @author :ljt
 * @date :Created in 2020/12/15 13:40
 * @description : 字面值常量
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */
public class Literals {
    public static void main(String args[]) {
        int i1 = 0x2f;
        System.out.println(Integer.toBinaryString(i1));
        int i2 = 0x7fffffff; //int 4字节 最大值
        System.out.println("i2 = "+i2+", Binary: "+Integer.toBinaryString(i2));
        int i3 = 0x80000000; //int 4字节 最小值
        System.out.println("i3 = "+i3+", Binary: "+Integer.toBinaryString(i3));
        char i4 = 0xffff; //char 2字节无符号
        System.out.println("i4 = "+i4+", Binary: "+Integer.toBinaryString(i4));
        byte i5 = 0x7f; //byte 1字节
        System.out.println("i5 = "+i5+", Binary: "+Integer.toBinaryString(i5));
        short i6 = 0x7fff; //short 2字节
        System.out.println("i6 = "+i6+", Binary: "+Integer.toBinaryString(i6));

//        int i7 = (int)0b001;
        int i = -1;
        System.out.println("i = "+i+"  "+Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println("i = "+i+"  "+Integer.toBinaryString(i));
    }
}
