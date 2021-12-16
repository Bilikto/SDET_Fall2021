package oop_class_Chirag.class_object_intro;

import oop_class_Chirag.class_object_intro.Bank;

public class Tester {

    public static void main(String[] args) {

        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "Tom";
        acc1.typeOfAccount = "Savings";

//        acc1.checkBalance(); //1000

//        acc2 = acc1;
        acc2.balance = 5000;
        acc2.accName = "Jerry";
        acc2.typeOfAccount = "Savings";

//        acc2.checkBalance(); //5000

        acc1.printAccountInfo();
    }

}
