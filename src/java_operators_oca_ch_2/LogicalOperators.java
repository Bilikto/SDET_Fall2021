package java_operators_oca_ch_2;

public class LogicalOperators {
    public static void main(String[] args) {
        // || -> OR
        // && -> AND
        boolean b = true || false;
        System.out.println(b); //true

        boolean b1 = false || false;
        System.out.println(b1); //false

        boolean b2 = true && false;
        System.out.println(b2); //false

        boolean b3 = true && true;
        System.out.println(b3); //true


        int i1 = 12;
        int i2 = 34;
        boolean b5 = false;
        boolean b6 = b5 || i1 > i2;
        System.out.println(b6); //false


        int x = 6;
        boolean y = x >= 6 || x++ <= 7 && x > 6; //page 65 of the OCA book
        System.out.println("The final value of y is: " + y + ". And the value of x is: " + x);

        // XOR -> Exclusive OR x ^ r
        // if both sides of the operation have the same value then it evaluates to false
        // and if one side is true then it becomes true

        boolean b7 = 4 < 5 ^ 6 > 7;
        System.out.println(b7); //true

        boolean b8 = true ^ false;
        System.out.println(b8); //true

        boolean b9 = true ^ true;
        System.out.println(b9); //false

        boolean b10 = false ^ false;
        System.out.println(b10); //false

        boolean b11 = true ^ true ^ true;
        System.out.println(b10); //false

    }
}
