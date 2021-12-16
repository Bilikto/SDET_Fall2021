package oop_class_Chirag.static_methods;

public class Bank {

    int balance;
    static int accNum;

    public void printBalance() {
        System.out.println(balance);
    }

    //From "static" methods we can not use instance vars, bc instance vars gets created when object is created!!! But we can create object inside static method and use instance vars
    public static void printAccNum() {
        System.out.println(accNum);
//        System.out.println(balance);
        Bank b = new Bank();
        b.balance = 5000;
        System.out.println(b.balance);

    }

}

class BankTest {

    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        bank1.balance = 2000;
        bank1.accNum = 12346;

        bank2.balance = 5000;
        bank2.accNum = 999999;

        bank1.printBalance();
        Bank.printAccNum();
        System.out.println(Bank.accNum);
    }
}
