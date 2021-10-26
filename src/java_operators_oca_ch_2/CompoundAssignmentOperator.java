package java_operators_oca_ch_2;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        //this operator is called "compound assignment" operator
        y += x;
        System.out.println(y); //3
        y -= x;
        System.out.println(y);
        y *= x;
        System.out.println(y);
        y /= x;
        System.out.println(y);


        //% modulus operator will give us the remainder
        int num2 = 5 % 2; //1
        // one of the use cases for using modulo is
        // when trying to identify if the number is odd vs even
        // EX: 4/2 reminder of 0;
        // EX: 5/2 reminder is 1;


        System.out.println(15.6 % 2); //1.5999999999999996
        System.out.printf("%.1f", 15.6 % 2); //1.6
        System.out.println();
        System.out.printf("%.2f", 15.6 % 2); //1.60
        System.out.println();

        //String concatenation
        // when adding any value to the string java will convert that value to a string
        System.out.println("12" + "5"); //125
        System.out.println("The value of PI is: " + 3.14 + (double) + 1); //The value of PI is : 3.141.0
        System.out.println("The value of PI is: " + (3.14 + (double) + 1)); //The value of PI is : 4.140000000000001
        //System.out.println("The value of PI is: %.2f", 3.14 + (double) + 1); //The value of PI is : 4.140000000000001

        String hello = "Hello "; // we can use \s
        String world = "world";
        System.out.println(hello + world);


    }
}

/*

 \s -> space
(type cast) has higher precedence than adding (+)

 */
