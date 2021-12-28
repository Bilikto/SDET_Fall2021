package oop_class_Chirag.polymorphism;

class PayPal {

    //Overloading, without Dynamic Polymorphism.
//    public void displayInterestRate(HSBCBank hsbc) {
//        hsbc.displayInterestRate();
//    }
//
//    public void displayInterestRate(CitiBank citi) {
//        citi.displayInterestRate();
//    }
//
//    public void displayInterestRate(ChaseBank chase) {
//        chase.displayInterestRate();
//    }


        //Dynamic Polymorphism!!!!
    public void displayInterestRate(Bank bank) {
        bank.displayInterestRate();
    }

}



public class PayPalTester {
    public static void main(String[] args) {

        HSBCBank acc1 = new HSBCBank();
        CitiBank acc2 = new CitiBank();
        ChaseBank acc3 = new ChaseBank();

        PayPal p = new PayPal();
        p.displayInterestRate(acc1);
        p.displayInterestRate(acc2);
        p.displayInterestRate(acc3);

    }
}


