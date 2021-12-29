package oop_class_Chirag.abstraction;

public interface Car {

    //Interface provide MAIN functionality to implement...
    //Using Interface we can achieve dynamic polymorphism...

    void drive(); //all methods by default are abstract and public
    void pressBreak();
    void playMusic();
    void reverse();

}


class Toyota implements Car {

    @Override
    public void drive() {

    }

    @Override
    public void pressBreak() {

    }

    @Override
    public void playMusic() {
        System.out.println("Play Alexa music");
    }

    @Override
    public void reverse() {

    }
}

class Ford implements Car {

    @Override
    public void drive() {

    }

    @Override
    public void pressBreak() {

    }

    @Override
    public void playMusic() {
        System.out.println("Press music button");
    }

    @Override
    public void reverse() {

    }
}

//inheriting Interface
interface SportsCar extends Car {
    void accelerateAtHighSpeed();
}

class RepairShop {
    //Dynamic polymorphism
    public void repair(Car c) {
        System.out.println(c + " is repairing");
    }
}


