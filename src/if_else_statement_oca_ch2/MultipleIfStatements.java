package if_else_statement_oca_ch2;

import user_input.ScannerClass;

import java.util.Scanner;

public class MultipleIfStatements {
    public static void main(String[] args) {
        System.out.println("Welcome to our shop!");

        char gender = 'F';

        if (gender == 'F' || gender == 'f')
            System.out.println("here is our collection for women: " +
                "\n1. some clothes" +
                "\n2. some clothes" +
                "\n3. some clothes");
        else System.out.println("here is our collection for men: " +
                "\n1. some clothes" +
                "\n2. some clothes" +
                "\n3. some clothes");

        // I want to get a number from a user to print out the day of the week
        // and also print out if it`s a week day of weekend

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 7");

        int dayNum = scanner.nextInt();
        if (dayNum == 1) {
            System.out.println("Sunday");
        } else if (dayNum == 2) {
            System.out.println("Monday");
        } else if (dayNum == 3) {
            System.out.println("Tuesday");
        } else if (dayNum == 4){
            System.out.println("Wednesday");
        } else if (dayNum == 5) {
            System.out.println("Thursday");
        } else if (dayNum == 6) {
            System.out.println("Friday");
        } else if (dayNum == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("Enter a valid number in range 1 to 7");
        }





    }
}
