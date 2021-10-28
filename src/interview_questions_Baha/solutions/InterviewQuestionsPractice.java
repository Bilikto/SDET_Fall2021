package interview_questions_Baha.solutions;

import java.util.Scanner;

public class InterviewQuestionsPractice {
    public static void main(String[] args) {
        //24 swap elements
//        int x = 100;
//        int y = 10;
//        int temp = x;
//        x = y;
//        y = temp;
//        System.out.println(x + " " + y);

        //Solution without creating additional var
//        x = x + y;
//        y = x - y;
//        x = x - y;
//        System.out.println(x + " " + y);


        //26
//        String pass = "Pass";
//        String fail = "Fail";
//        int testRes = 73;
//        System.out.println(testRes >= 50 ? pass : fail);


        //27 Will it compile or not?
//        short s1 = 123;
//        short s2 = 456;
//        short sum = (short) (s1 + s2); //error
//        System.out.println(sum); //No, bc the arithmetic operations carry out in int data type. So the fix is [short sum = (short) s1 + s2;]
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);


        // 10/20/2021
        // Task is write program that will compare the last digit of 2 numbers
        // and print out "Equal" if the are equal
        // and vice verse "Not Equal"
//        int x = 12;
//        int y = 22;
//        int lastX = 12 % 10;
//        int lastY = 22 % 10;
//
//        if (lastX == lastY) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");
//        }
//
//        if (x % 10 == y % 10) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");
//        }
//
//        System.out.println(33 % 100); //33
//        System.out.println(313 % 100); //13


//        String sX = Integer.toString(x);
//        String sY = Integer.toString(y);
//        if (sX.charAt(1) == sY.charAt(1)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not equal");
//        }


        //Task is to identify if the number is odd or even
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number:");
//        int num = scanner.nextInt();
//
//        if (num % 2 == 0) { //to find even number always use % and 2 !!!
//            System.out.println("The " + num + " is even");
//        } else {
//            System.out.println("The " + num + " is odd");
//        }

        //Two rules with modulo!
        // 1. To find even or odd number use modulo % with 2 (num % 2) (reminder of odd numbers always 1)
        // 2. To find last digit of the number use modulo % with 10 (num % 10)

        //System.out.println(123456 % 10000); //3456 //4 zeroes means get last 4 digits


        //Task: first char digit
//        String s = "Baha";
//        char a = scanner.next().charAt(s.length());
//        System.out.println(a);


        // Task is take input as a string from user
        // and check the first character and identify if it`s a digit or not
        // if it`s a digit print out "The first char is a digit"
        // if not then "It`s not a digit"
        System.out.println("Please enter a text:");
        String text = scanner.nextLine();
        int firstChar = text.charAt(0);
//        if (firstChar >= '0' && firstChar <= '9') { // if (firstChar >= 48 && firstChar <= 57) from ASCII
//            System.out.println("The first char is a digit");
//        } else {
//            System.out.println("It is not a digit");
//        }

        if (Character.isDigit(firstChar)) { // if (firstChar >= 48 && firstChar <= 57) from ASCII
            System.out.println("The first char is a digit");
        } else {
            System.out.println("It is not a digit");
        }























    }
}
