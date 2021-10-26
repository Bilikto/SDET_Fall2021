package if_else_statement_oca_ch2.nested_if_else_stmts;

import java.util.Scanner;

public class NestedIfElse1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Is the car started?");
//        boolean isRunning = scanner.nextBoolean();
//
//        String whatsNext = "back up";
//        String drive = "Change gear to 'D'";
//        String backUp = "Change gear to 'R'";
//
//        if (isRunning) {
//            if (whatsNext == "drive") {
//                System.out.println(drive);
//            } else {
//                System.out.println(backUp);
//            }
//        }

        System.out.println("Is it raining outside? Type 'Y' for Yes or 'N' for No");
        char yesOrNo = scanner.next().charAt(0);
        boolean isRaining = (yesOrNo == 'Y' || yesOrNo == 'y');

        System.out.println("What is the temp outside?");
        byte temp = scanner.nextByte();

        String stayInside = "Stay inside";
        String coat = "Put on a coat";
        String jacket = isRaining ? "Put on a rain jacket" : "Put on a jacket";
        String lightClothes = "Put on a light clothing";
        String umbrella = " and grab umbrella";

        if (isRaining) {
            if (temp < 30) {
                System.out.println(stayInside);
            } else if (temp <= 50) {
                System.out.println(coat + umbrella);
            } else if (temp <= 70) {
                System.out.println(jacket + umbrella);
            } else {
                System.out.println(lightClothes + umbrella);
            }
        } else {
            if (temp < 30) {
                System.out.println(stayInside);
            } else if (temp <= 50) {
                System.out.println(coat);
            } else if (temp <= 70) {
                System.out.println(jacket);
            } else {
                System.out.println(lightClothes);
            }
        }


    }
}
