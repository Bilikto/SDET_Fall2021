package oop_class_Chirag.static_variables;

class Bank {

    //static means common variable for objects
    int balance; //--> instance var
    static int accNUm; //--> static var

    public void displayBalance() {
        //System.out.println(balance);
        System.out.println(accNUm);
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();
        b1.balance = 20;
        b2.balance = 50;
        b1.accNUm= 1;
        b2.accNUm = 2;

        b1.displayBalance();
        b2.displayBalance();
    }

}
