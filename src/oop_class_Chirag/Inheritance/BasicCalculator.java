package oop_class_Chirag.Inheritance;

public class BasicCalculator {
    int a = 10;

    public  void sum(int a, int b) {
        System.out.println(a + b);
    }

    public  void sub(int a, int b) {
        System.out.println(a - b);
    }
}

class AdvanceCalculator extends BasicCalculator {
    int a = 20;

    public  void mul(int a, int b) {
        System.out.println(a * b);
    }

    public  void div(int a, int b) {
        System.out.println(a / b);
    }

    public void printA() {
        System.out.println(a); //20
        System.out.println(super.a); //10
    }



}