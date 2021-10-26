package if_else_statement_oca_ch2;

import java.util.Scanner;

public class IfElsePractice1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the outside temp?");
        int outsideTemp = scanner .nextInt();

        System.out.println("Is it raining outside?");
        boolean isRaining = scanner.nextBoolean();

        if (isRaining && outsideTemp <= 30) {
            System.out.println("Stay home");
        } else if (isRaining && outsideTemp <= 50) {
            System.out.println("Wear coat");
        } else if (isRaining && outsideTemp <= 70) {
            System.out.println("Wear rain jacket");
        } else if (!isRaining && outsideTemp > 70) {
            System.out.println("wear light clothes");
        } else {
            System.out.println("Enjoy the weather");
        }
    }



}
