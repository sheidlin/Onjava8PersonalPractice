package com.pbljt.tij.capter19_typeinfo;

import java.util.stream.Stream;

/**
 * @author :ljt
 * @date :Created in 2020/12/17 23:01
 * @description :
 * -----------------------
 * ----xxx---------xxx----
 * ----|.|---------|.|----
 * --------xxxxxxx--------
 * --------x-----x--------
 * -----------------------
 */

abstract class Shape {
    void draw() { System.out.println(this + ".draw()"); }
    @Override
    public abstract String toString();
}

class Circle extends Shape {
    @Override
    public String toString() { return "Circle"; }
}

class Square extends Shape {
    @Override
    public String toString() { return "Square"; }
}

class Triangle extends Shape {
    @Override
    public String toString() { return "Triangle"; }
}

public class Shapes {
    public static void main(String[] args) {
        Stream<Shape> shapeStream = Stream.of(
                new Circle(), new Square(), new Triangle());
        shapeStream.forEach(Shape::draw);
    }
}