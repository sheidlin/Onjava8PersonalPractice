package com.pbljt.tij.iterator;

import java.util.*;

/**
 * @author :ljt
 * @date :Created in 2020/12/18 22:20
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

abstract class Individual {
    int a;

    public Individual() {
    }

    public Individual(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Individual{" +
                "a=" + a +
                '}';
    }
}

class Student extends Individual {
    public Student(int a) {
        super(a);
    }
}
class Teacher extends Individual {
    public Teacher(int a) {
        super(a);
    }
}

public class Mytest {
    public static void main(String args[]) {
        ArrayList list = new ArrayList();
        list.add(new Student(1));
        list.add(new Teacher(2));
        List readOnly = Collections.unmodifiableList(list);
        list.forEach(str -> System.out.println(str.toString()));
//        readOnly.add(new Student(3));//无法添加
//        readOnly.sort((c1, c2) -> {//无法排序
//            return Teacher.class.isInstance(c1) ? -1 : 1;
//        });
        readOnly.forEach(str -> System.out.println(str.toString()));
    }
}
