package interview_questions_Baha;

import java.util.Scanner;

public class InterviewQuestions {

    static final double PI = 3.14;

    public static void main(String[] args) {
        //#1
        //Will the above code compile? If not what's the cause?
//        int i;
//        System.out.println(i); //java: variable i might not have been initialized

        //#2
        //Predict the output of following Java program
        int i1 = 1;
        double d1 = 2.4;
//        System.out.println("The sum is: " + i1 + d1); //12.4

        //#3
        //Will this code compile?
//        int num1;
//        int num2 = 5;
//        int sumOfNums = num1 + num2;
//        System.out.println(sumOfNums); //java: variable num1 might not have been initialized

        //#4
        //What is the DATA TYPE of ‘sum’?
        int num1 = 4;
        double num2 = 4.4;
        float num3 = 7.3F;
        double sum = num1 + num2 + num3; // sum is double bc double is higher than float

//        #5
//        Difference between "implicit" and "explicit" type casting? And why it is needed?
//              - implicit means automatic convertion (from smaller to larger number).
//              - explicit means manually (we have to explicit specify type in the parenthesis)

//        #6
//        What is main() method in our application? - It is entry point to execute our code.

//        #7
//        System.out.print() vs System.out.println()?
//              - System.out.print() - in one line;
//              - System.out.println() - in 2 or more lines

//        #8
//        Class structure in java?

//        #9
        // What are reserved keywords and what happens if we use them as Java identifiers?
        // EX: String class = "Hello";

//        #10
//        What will be the output if I print out this variable?
//        char ch1 = 78;
//        System.out.println(ch1); //N from ASCII table

//         #11
//         What will be printed out?
//            PI = 3.15; //PI is declared as static--see above!!!
//            System.out.println(PI); // We can not assign a value to constant!

//        #12
//        Ternary Operator EX
        char caseChar = 'B';
        String yourName;
        yourName =  caseChar == 'B' ? "BILLY" : "billy";
        System.out.println(yourName);
        yourName =  caseChar == 'b' ? "BILLY" : "billy";
        System.out.println(yourName);

//        #13
//        use ternary operator to display this message
        char gender = 'F';
        String fString = "Hello welcome to our fall clothing collection store!\n" +
                "Here is the list of items available for you to choose the best outfit:\n" +
                "1. Jackets for women\n" +
                "2. Long sleeve shirts\n" +
                "3. Classic coats for women\n" +
                "4. Cashmere scarves";

        String mString = "Hello welcome to our fall clothing collection store!\n" +
                "Here is the list of items available for you to choose the best outfit:\n" +
                "1. Jackets\n" +
                "2. Polo long sleeves\n" +
                "3. Classic coats\n" +
                "4. Classic scarves";

        String fMessage = gender == 'F' ? fString : mString;
        String mMessage = gender == 'M' ? fString : mString;
        System.out.println(fMessage);
        System.out.println(mMessage);


//        #14
//        What is the output of the below code?
        int i = 5;
        boolean bool = i-- < 6 || ++i >= 5 && i > 7;
        System.out.println(i + " " + bool); //4 true

//        #15
//        Write a ternary operator which checks if the number is even or odd [Hint: % -> gives us the remainder of 0 if the number is even when divided by 2].
//        And if the number is even then prints out “The number is even.” or if odd then “The number is odd.”
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int remainder = num % 2;
        String isEven = remainder == 0 ? "The number is even" : "The number is odd";
        System.out.println(isEven);

//        #16
//        What will be the output of the below code?
        int x = 1;
        int y = 2;

        boolean bool1 = x < y && y >= ++x;

        System.out.println(x);
        System.out.println(bool1);









    }
}
