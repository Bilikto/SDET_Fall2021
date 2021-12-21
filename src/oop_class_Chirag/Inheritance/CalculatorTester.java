package oop_class_Chirag.Inheritance;

public class CalculatorTester {
    public static void main(String[] args) {
        BasicCalculator basic = new BasicCalculator();
        AdvanceCalculator advance = new AdvanceCalculator();
        basic.sum(10, 20);
        advance.mul(10, 20);

        advance.printA();
    }
}
