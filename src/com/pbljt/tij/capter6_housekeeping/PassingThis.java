package com.pbljt.tij.capter6_housekeeping;

/**
 * @author :ljt
 * @date :Created in 2020/12/15 17:01
 * @description : this关键词的应用
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

class Person {
    class Mouse {
        Food eat(Food food) {
            return(food.getEaten());
        }
    }
    Mouse mouse = new Mouse();
    Food eat(Food food) {
        return mouse.eat(food);
    }
}

class Food {
    boolean eat = false;
    void getStatus() {
        if(eat)System.out.println("have be eaten");
        else System.out.println("already exists");
    }
    Food getEaten() {
        System.out.println("Food be eaten");
        eat = true;
        return this;
    }
}

class ChickenLeg extends Food{
    ChickenLeg getEaten() {
        System.out.println("Chicken be eaten");
        eat = true;
        return this;
    }
}

public class PassingThis {
    public static void main(String args[]) {
        Person ljt = new Person();
        Food food = new ChickenLeg();
        food.getStatus();
        food = ljt.eat(food);
        food.getStatus();
    }
}
