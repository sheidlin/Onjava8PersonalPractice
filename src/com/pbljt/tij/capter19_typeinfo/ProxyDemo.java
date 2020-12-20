package com.pbljt.tij.capter19_typeinfo;

/**
 * @author :ljt
 * @date :Created in 2020/12/20 13:35
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

interface Interace {
    void doHomeWork(String s);
}

class Student implements Interface {
    @Override
    public void doHomeWork(String s) {
        System.out.println(s);
    }
}

class StudentProxy implements Interface {
    Student student;

    public StudentProxy(Student student) {
        this.student = student;
    }

    @Override
    public void doHomeWork(String s) {
        if(s == "not to do") {
            System.out.println("ok fine");
        }
        else {
            student.doHomeWork(s);
        }
    }
}

public class ProxyDemo {
    static void doHomework(Interface in) {
        in.doHomeWork("not to do");
    }
    public static void main(String args[]) {
        doHomework(new Student());
        doHomework(new StudentProxy(new Student()));
    }
}
