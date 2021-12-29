package oop_class_Chirag.encapsulation.access_modifiers;

public class Car {
    private int price = 1000;

    public void printPrice() {
        System.out.println(price);
    }
}

class CarInfo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.printPrice();
    }
}