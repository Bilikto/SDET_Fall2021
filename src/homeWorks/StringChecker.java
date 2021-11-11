package homeWorks;

import java.util.Scanner;

public class StringChecker {
    public static void main(String[] args) {

        String wordToFind = "task";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter text..");
        String str = scanner.nextLine().toLowerCase();

        if (str.contains("task")) {
            System.out.println("String: " + str);
            System.out.println("Word to find: " + wordToFind);
            System.out.println(true);
        } else {
            System.out.println("The word " + wordToFind + " not found");
        }

    }
}
