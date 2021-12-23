package oop_class_Chirag.polymorphism;

public class Shape {

    void draw() {
        System.out.println("draw");
    }

    void erase() {
        System.out.println("erasing everything");
    }
}

class Circle extends Shape {

    void draw() {
        System.out.println("drawing circle");
    }

}

class Square extends Shape {

    void draw() {
        System.out.println("drawing square");
    }

}

class Triangle extends Shape {

    void draw() {
        System.out.println("drawing triangle");
    }

}
