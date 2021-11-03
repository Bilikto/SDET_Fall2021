package methods;

import java.util.Scanner;

public class PrintHelloWithName {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        sayHelloToUser();

        System.out.println("Please, enter your age: ");
        int age = scanner.nextInt();
        printAge(age);



    }

    public static void sayHelloToUser() {

        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    public static void printAge(int age) {
        System.out.println("Your age is: " + age);
    }




}
