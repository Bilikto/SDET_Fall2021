package homeWorks;

import java.util.Scanner;

public class MethodPracticeClass {
    public static void main(String[] args) {
        printName("Billy");
        new MethodPracticeClass().printAgeMinusTen(34);
        printQuote();

    }

    public static void printName(String name) {
        System.out.println("My name is: " + name);
    }

    public void printAgeMinusTen(int age) {
        System.out.println("My age and minus 10 is " + (age - 10));
    }

    private static void printQuote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your favorite quote...");
        String quote = scanner.nextLine();
        System.out.println("My favorite quote is: " + "\"" + quote + "\"");
    }


}
