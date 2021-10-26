package user_input;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Please enter your grade ");
//        char grade = scanner.nextChar(); // there is no nextChar() method
//        char grade = scanner.next().charAt(0); //charAt() comes from String class
//        System.out.println("You grade is " + grade);


        //I want to get the gender of a user of a shopper and provide our clothing collections accordingly
        //There will be two string objects
        //First string will contain the collection for men
        //and second object will contain women`s collection
//        scanner.nextLine();
        System.out.println("Please enter gender:");
        char gender = scanner.next().charAt(0);
        String menCollections= "Hello welcome to our fall clothing collection store!\n" +
                "Here is the list of items available for you to choose the best outfit:\n" +
                "1. Jackets for men\n" +
                "2. Long sleeve shirts\n" +
                "3. Classic coats for men\n" +
                "4. Active wear etc";

        String youngMenClothes = "Hello welcome to our fall clothing collection store!\n" +
                "Here is the list of items available for you to choose the best outfit:\n" +
                "1. Jackets for young men\n" +
                "2. Long sleeve shirts\n" +
                "3. Classic coats for young men\n" +
                "4. Active wear etc";

        String womenCollections = "Hello welcome to our fall clothing collection store!\n" +
                "Here is the list of items available for you to choose the best outfit:\n" +
                "1. Jackets for women\n" +
                "2. Long sleeve shirts\n" +
                "3. Classic coats for women\n" +
                "4. Cashmere scarves";

        boolean bool = gender == 'F' || gender == 'M' || gender == 'B' || gender == 'G';


        System.out.println( "The value of bool is " + bool);
        //System.out.println(gender == 'F' || gender == 'f' ? womenClothes : );
        System.out.println("Here is our collections for you: \n" + (bool ? (gender == 'M' ?  menCollections: womenCollections) : "Please enter" +
                " 'M' for male or 'F' for female!"));


    }
}
