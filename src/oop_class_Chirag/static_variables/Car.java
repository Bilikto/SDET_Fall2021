package oop_class_Chirag.static_variables;

public class Car {

    static int count;
    int c;

    public Car() {
        count = count + 1;
        c = count;
    }

    public void displayC() {
        System.out.println(c);
    }
}

class RecapOfStaticExample1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.displayC(); //1
        car2.displayC(); //2
        car3.displayC(); //3

    }
}
