package oop_class_Chirag.Inheritance;

public class Animal {

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

}

class Dog extends Animal {
    public void bark() {
        System.out.println("bark");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("meow");
    }
}

