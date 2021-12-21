package oop_class_Chirag.Inheritance;

public class PhoneTester {
    public static void main(String[] args) {
        BasicPhone basic = new BasicPhone();
        SmartPhone smartPhone = new SmartPhone();

        basic.call();
        basic.text();
        smartPhone.takePhoto();
        smartPhone.takeVideos();
        smartPhone.call();
        smartPhone.text();
    }
}
