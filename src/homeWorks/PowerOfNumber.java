package homeWorks;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        /*
        * Write a Java program to compute the power of a number (acceptable boundaries for power is 0 till 9).
        * Example:
        * Input the number: 2
        * Input the Power: 5
        * Expected Output
        * Result: 64
* */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number...");
        int num = scanner.nextInt();
        System.out.println("Enter the power value...");
        int power = scanner.nextInt();

//        if (power >= 0 && power <= 9) {
//            System.out.println("The number " + num + " to the power of " + power + " is " + Math.pow(num, power) * 2);
//        } else {
//            System.out.println("Invalid power value...");
//        }

        int exp = 1;
        if (power >= 0 && power <= 9) {
            for (int i = 1; i <= power; i++) {
                exp = exp * num;
            }
        } else {
            System.out.println("Invalid power value...");
        }

        System.out.println(exp);

    }
}
