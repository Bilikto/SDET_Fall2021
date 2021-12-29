package oop_class_Chirag.abstraction;

//Java questions:
//Can we create an object using abstract class?
//No, we can`t!

//Can abstract class have a constructor?
//Yes! Constructor of abstract class get used from child class, when we create an object of child class parent class constructor get called first.

abstract class Bank {

    //If class has at least 1 abstract method it must be abstract class.
    //abstract class can not be instantiated!
    int balance;

    //constructor
    Bank() {

    }

    public abstract void displayInterestRate();

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    public void deposit(int amount) {
        balance = balance + amount;
    }

}

class HSBCBank extends Bank {
    @Override
    public void displayInterestRate() {
        System.out.println("3.5");
    }

}

public class AbstractClassExample {
    public static void main(String[] args) {
        HSBCBank hsbc = new HSBCBank();
        hsbc.displayInterestRate();
    }
}
