package loops.do_while_loop;

import java.util.Scanner;

public class ATMExampleWithDoWhile {

    public static void main(String[] args) {
        // After inserting your card
        // ask for pin code
        // if you get it incorrectly then you will have 3 tries
        // if you get it wrong all 3 times then we need to print "Go" into office or call 1-800-..."

        System.out.println("Please insert your card and enter your pin...");
        int pin = 1234;

        Scanner scanner = new Scanner(System.in);
        int counter = 0;

//        do {
//            int enteredPin = scanner.nextInt();
//            if(enteredPin == pin) {
//                System.out.println("Successful login. Thank you!");
//                counter = 0;
//            } else {
//                counter--;
//                if (counter > 0) {
//                    System.out.println("Entered pin is incorrect. Please try again:");
//                } else {
//                    System.out.println("You have reached the limit of tries. Your card is blocked.\n" +
//                            "Call 1-800-... to resolve!");
//                }
//            }
//        } while(counter > 0);

        for (int i = 1; i <= 3; i++) {
            int enteredPin = scanner.nextInt();
            if(enteredPin == pin) {
                System.out.println("Successful login. Thank you!");
                break;
            } else {
                counter++;
                if (counter ==3) break;
                System.out.println("Entered pin is incorrect. Please try again:");
                i--;
            }
        }

        if (counter == 3) {
            System.out.println("You have reached the limit of tries. Your card is blocked.\n" +
                    "Call 1-800-... to resolve!");
        }

    }
}
