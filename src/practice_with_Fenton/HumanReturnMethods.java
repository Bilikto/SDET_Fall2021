package practice_with_Fenton;

import java.util.Scanner;

public class HumanReturnMethods {

    public static void main(String[] args) {

//        printName();

//        Human billy = new Human();
//        billy.printAge();

//        new Human().printAge();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name..");
        String name = scanner.nextLine();
        System.out.println("Enter age..");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter last name");
        String lastName = scanner.nextLine();

        printName(name);

        HumanReturnMethods man = new HumanReturnMethods();
        man.printAge(age);
        String returnedLastName = man.getLastName(lastName);
        System.out.println(returnedLastName);


    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public void printAge(int age) {
        System.out.println(age);
    }

    public String getLastName(String lastName) {
        return lastName;
    }



}
