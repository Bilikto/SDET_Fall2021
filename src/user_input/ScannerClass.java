package user_input;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //in is constant means input
        /*
        * Scanner does not have nextChar() to take an input from user directly as a character (see UserInput.java)
        *  ** scanner.next().charAt(0); ** -> how to get char from input
        *
        *
        * next() -> for the string before the next white space
        * nextByte() -> for byte type;
        * nextShort -> for short type;
        * nextInt() -> for int type;
        * nextFloat() -> for float type;
        * nextDouble() -> for double type;
        * nextLong() -> for long type;
        * nextLine() -> for the string;
        * nextBoolean() -> for boolean type;
        * */

        //next()
//        System.out.println("Please enter your first name:");
//        String firstName = scanner.next(); //this next() method from scanner will take an input until white space
//
//        System.out.println("Please enter your last name:");
//        String lastName = scanner.next();
//
//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println("Enter your age:");
//        int age = scanner.nextInt();
//
//        System.out.println("Please enter your first name:");
//        String firstName = scanner.next();
//
//        System.out.println("Please enter your last name:");
//        String lastName = scanner.next();
//
//        System.out.println("Your first name is " + firstName + " last name " + lastName);
//        scanner.nextLine(); //without it string input is ignored (see screenshot shared by Dima Tsaruk)

        //nextLine()
//        System.out.println("Please enter your full name:");
//        String fullName = scanner.nextLine();
//        System.out.println(fullName);
//
//        //nextShort()
//        System.out.println("Enter yor age");
//        short age = scanner.nextShort();
//
//        //nextDouble()
//        System.out.println("What is the value of PI? ");
//        double PI = scanner.nextDouble();
//        System.out.println(PI);

        System.out.println("Are you 18 or over? Please enter \"true\" or \"false\"");
        boolean isQualified = scanner.nextBoolean();
        System.out.println(isQualified ? "Customer is qualified" : "Not qualified");



    }
}
