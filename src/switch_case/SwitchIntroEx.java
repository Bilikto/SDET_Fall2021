package switch_case;

import java.util.Scanner;

public class SwitchIntroEx {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String typeOfAnimal = " ";
        System.out.println("Please, enter a animalName of animal..");
        String animalName = scanner.nextLine().toLowerCase();

//        if (animalName.equals("dog") || animalName.equals("cat") || animalName.equals("hamster") || animalName.equals("chicken")) {
//            typeOfAnimal = "domestic";
//        }
//
//        if (animalName.equals("tiger") || animalName.equals("lion") || animalName.equals("monkey") || animalName.equals("bear")) {
//            typeOfAnimal = "wild";
//        }
//
//        System.out.println(typeOfAnimal);


//      switch doesn`t support: double, float, boolean, and String
        switch(animalName) {
            case "dog":
            case "cat":
            case "hamster":
            case "chicken":
                System.out.println("domestic");
                break;

            case "tiger":
            case "lion":
            case "monkey":
            case "bear":
                System.out.println("wild");
                break;
            default:
                System.out.println("Sorry, we do not know the type of animal");
        }


    }

}
