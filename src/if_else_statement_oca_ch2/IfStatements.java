package if_else_statement_oca_ch2;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

        /*
        * run time is when we actually run our code or during execution
        * compile time before any code gets executed
        *
        *! -> negation mark
        *
        * */

        String welcomeMsg = "Hello welcome to our site! ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        short age = scanner.nextShort();

        if (age >= 18) {
            System.out.println(welcomeMsg);
        } else {
            System.out.println("Sorry, you have too be 18 or older");
        }

    }
}
