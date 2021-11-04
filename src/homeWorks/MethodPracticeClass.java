package homeWorks;

import java.util.Scanner;

public class MethodPracticeClass {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printName("Billy");
        MethodPracticeClass myObj = new MethodPracticeClass();
        myObj.printAgeMinusTen(34);
        printQuote();

        myObj.printMyFavoriteQuote("Being happy is the greatest form of success");

        System.out.println("Enter DOB:");
        String dob = scanner.nextLine();
        System.out.println("First name:");
        String firstName = scanner.nextLine();
        System.out.println("Last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter your height");
        int height = scanner.nextInt();
        System.out.println("Enter your weight");
        int weight = scanner.nextInt();
        System.out.println(recruitingToAirForce(dob, firstName, lastName, height, weight));


    }

    public static void printName(String name) {
        System.out.println("My name is: " + name);
    }

    public void printAgeMinusTen(int age) {
        System.out.println("My age and minus 10 is " + (age - 10));
    }

    private static void printQuote() {
        System.out.println("Enter your favorite quote...");
        String quote = scanner.nextLine();
        System.out.println("Your favorite quote is: " + "\"" + quote + "\"");
    }

    private void printMyFavoriteQuote(String str) {
        System.out.println("My favorite quote is "+ str);
    }

    private static String recruitingToAirForce(String dob, String firstName, String lastName, int height, int weight) {
        return (height > 160 && weight < 220) ? "Congratulations! You qualify for United States Air Force!" : "Sorry you don’t qualify..";

//        if (height > 160 && weight < 220) {
//            System.out.println("Congratulations! You qualify for United States Air Force!");
//        } else {
//            System.out.println("Sorry you don’t qualify..");
//        }
    }

}
git add .