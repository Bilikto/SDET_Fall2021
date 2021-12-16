package oop_class_Chirag.constructor;

public class Bank {

    String branch;
    int balance;
    int accNumber;

    Bank(String branch) {
        this(branch, 5000);
        System.out.println("Hello1");
    }

    Bank(String branch1, int balance1) {
        this(branch1, balance1, 12346789);
        System.out.println("Hello2");
    }

    Bank(String branch1, int balance1, int accNumber1) {
        this.branch = branch1;
        this.balance = balance1;
        this.accNumber = accNumber1;
        System.out.println("Hello3");
    }

    public void displayCustInfo() {
        System.out.println(branch);
        System.out.println(balance);
        System.out.println(accNumber);
    }



}
