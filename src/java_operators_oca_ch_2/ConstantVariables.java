package java_operators_oca_ch_2;

public class ConstantVariables {

    int  i; //instance variable - field
    static final double PI = 3.14; // class variable

    public static void main(String[] args) {
        int i; //just initialized
        i = 3;
        System.out.println(i);

        // There are variables called constants and they are also known as "final" variables
        // keyword is used to initialization of the variable
        // they can be declared and initialized only once
        // they cannot be updated during program execution so they are called "immutable" variables
        // Constants are capitalized!
        final String DOB = "01/01/1871";
        final double PI = 3.14;




    }

}
