package if_else_statement_oca_ch2;

import java.util.Scanner;

public class IfElseAndElseIf {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please, enter your age..");
    short age = scanner.nextShort();

    if (age >= 80) {
        System.out.println("You are in your 80s.");
    } else if (age >= 70) {
        System.out.println("You are in your 70s.");
    } else if (age >= 60) {
        System.out.println("You are in your 60s.");
    } else if (age >= 50) {
        System.out.println("You are in your 50s.");
    } else if (age >= 40) {
        System.out.println("You are in your 40s.");
    } else if (age >= 30) {
        System.out.println("You are in your 30s.");
    } else {
        System.out.println("You are young");
    }





    }
}
