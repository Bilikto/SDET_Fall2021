package oop_class_Chirag.Inheritance;

public class BasicPhone {

    void call() {
        System.out.println("Calling...");
    }

    void text() {
        System.out.println("My text...");
    }
}

class SmartPhone extends BasicPhone {
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    public void takeVideos() {
        System.out.println("Taking video...");
    }

}
