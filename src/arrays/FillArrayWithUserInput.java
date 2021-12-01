package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayWithUserInput {

    public static void main(String[] args) {
        String python = "Python";
        String gorilla = "Gorrila";
        String[] wildAnimals = {"Eagle", python, "Anaconda", gorilla, "Ostrich"};

        for(String animal : wildAnimals) {
            if(animal.equalsIgnoreCase("python")) {
                System.out.println("I have found python so I will skip to the next animal.");
                continue;
            } else if(animal.equalsIgnoreCase("Anaconda")) {
                System.out.println("I have came acrross " + animal + ". Terminating now");
                break;
            } else {
                System.out.println(animal);
            }
        }



        Scanner scanner = new Scanner(System.in);
        System.out.println("How many animal do you want to add?");

        String[] zooAnimals = new String[scanner.nextInt()];
        scanner.nextLine();

        for(int i = 0; i < zooAnimals.length; i++) {
            System.out.println("Please enter " + (zooAnimals.length - i) + " animals more");
            zooAnimals[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(zooAnimals));



    }


}
