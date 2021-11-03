package methods;

import java.util.Scanner;

public class WalkingDogWithMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.println("Please enter the time in military format");
        short time = scanner.nextShort();

        String morning = "Time for morning";
        String afternoon = "Time for afternoon";
        String lunch = "Time for lunch";
        String evening = "Time for evening";


        if (time >= 700 && time <= 800) {
            walkTheDog(morning);
        } else if (time >= 1200 && time <= 1300) {
            walkTheDog(afternoon);
        } else if (time >= 1500 && time <= 1600) {
            walkTheDog(lunch);
        } else if (time >= 1900 && time <= 2100) {
            walkTheDog(evening);
        }

    }

    public static void walkTheDog(String str) {

        String timeToDress = str + " walk \n" +
                "1. dress up put on a jacket\n" +
                "2. put on a hat\n" +
                "3. put on a scarf [optional]\n" +
                "4. wear winter shoes\n" +
                "5. wear gloves\n" +
                "6. dress your dog with warm clothes";

        System.out.println(timeToDress);

    }



}
