package homeWorks;

import java.util.Scanner;

public class CheckCapitalLetter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any strings..");
        String str = scanner.nextLine();

        if (str.charAt(0) >= 65 && str.charAt(0) <= 90) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
