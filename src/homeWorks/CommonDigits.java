package homeWorks;

import java.util.Scanner;

public class CommonDigits {
    public static void main(String[] args) {
        /*
        * Write a Java program that accepts two integer values between 25 to 75 and return true if there is
        * a common digit in both numbers.
        * Sample Output
        * Input the first number : 35
        * Input the second number: 45
        * Result: true
        * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number..");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number..");
        int num2 = scanner.nextInt();

        if (num1 < 25 || num2 > 75) {
            System.out.println("Invalid number..");
        }

        int first1 = num1 / 10;
        int second1 = num1 % 10;

        int first2 = num2 / 10;
        int second2 = num2 % 10;

        System.out.println((first1 == first2 || first1 == second2) || (second1== first2 || second1 == second2));



    }
}
