package oop_class_Chirag.polymorphism;

//Dynamic Polymorphism!!!
class Bank {
    public void displayInterestRate() {
        System.out.println("");
    }
}

public class HSBCBank extends Bank {
    @Override
    public void displayInterestRate() {
        System.out.println("3.5");
    }
}


class CitiBank extends Bank {
    @Override
    public void displayInterestRate() {
        System.out.println("6.5");
    }
}

class ChaseBank extends Bank {
    @Override
    public void displayInterestRate() {
        System.out.println("7.2");
    }
}
