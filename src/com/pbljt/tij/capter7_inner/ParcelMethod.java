package com.pbljt.tij.capter7_inner;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 16:32
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

class Student {
    //final name?
    private String n;
    HomeWork writeHomework(String name) {
        final class HomeworkRes implements HomeWork{
            private String studentName = n;

            public HomeworkRes(String studentName) {
                this.studentName = studentName;
            }

            @Override
            public void judge() {
                System.out.println(studentName+"'s homework!");
            }
        }
        return new HomeworkRes(name);
    }
}

public class ParcelMethod {
    public static void main(String args[]) {
        HomeWork homeWork = new Student().writeHomework("ljt");
        homeWork.judge();
    }
}
