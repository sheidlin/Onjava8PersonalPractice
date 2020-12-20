package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 8:53
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

class HomeWork {
    void finishThat(){}
}

interface HomeWorkFactory {
    HomeWork getHomework();
}

class MathHomework extends HomeWork {
    @Override
    void finishThat() {
        System.out.println("OK! Finish math homework!");
    }
}

class ChineseHomework extends HomeWork {
    @Override
    void finishThat() {
        System.out.println("OK! Finish Chinese homework!");
    }
}

class MathHomeworkFactory implements HomeWorkFactory {
    @Override
    public HomeWork getHomework() {
        return new MathHomework();
    }
}

class ChineseHomeworkFactory implements HomeWorkFactory {
    @Override
    public HomeWork getHomework() {
        return new ChineseHomework();
    }
}

public class DoHomeWorkFactory {
     public static void main(String args[]) {
         doHomeWork(new MathHomeworkFactory());
         doHomeWork(new ChineseHomeworkFactory());
     }

     public static void doHomeWork(HomeWorkFactory homeWorkFactory) {
         HomeWork homeWork = homeWorkFactory.getHomework();
         homeWork.finishThat();
     }
}
