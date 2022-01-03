package oop_class_Chirag.polymorphism.dynamicpolymorphism;

public class LgTV {
    //Dynamic Polymorphism or Run - Time Polymorphism
    //Parent class will have access to all child methods, except those which are implemented by child class!!!

    void chanel1() {
        System.out.println("1");
    }

    void chanel2() {
        System.out.println("2");
    }

}

class SonyTV extends LgTV {
    int chanelNums = 4;

    @Override
    void chanel1() {
        System.out.println("1");
    }

    @Override
    void chanel2() {
        System.out.println("2");
    }

    void chanel3() {
        System.out.println("3");
    }

    void chanel4() {
        System.out.println("4");
    }

}

class DynamicPolymorphism {
    public static void main(String[] args) {

//     reference var and object
        LgTV lg = new SonyTV(); //dynamic polymorphism
        lg.chanel1();
        lg.chanel2();
//        lg.chanel3(); //Error
//        lg.chanel4(); //Error
//        System.out.println(lg.chanelNums); //Error


        //To get access to all methods we can explicitly cast Object
        SonyTV sony = (SonyTV) lg;
        sony.chanel1();
        sony.chanel2();
        sony.chanel3();
        sony.chanel4();
        System.out.println(sony.chanelNums); //Error

    }
}
