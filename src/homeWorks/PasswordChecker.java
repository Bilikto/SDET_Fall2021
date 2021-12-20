package homeWorks;

import java.util.Scanner;
/*
* Write a Java method to check whether a string is a valid password.
* Password rules:
* A password must have at least ten characters.
* A password consists of only letters and digits.
* A password must contain at least two digits.
* Input a password: devx2021
* PW is Valid: devx2021
* */

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a password");
        String pw = scanner.nextLine().toLowerCase();

        if(isValidPassword(pw)) {
            System.out.println("Input a password " + pw);
            System.out.println("PW is valid " + pw);
        } else {
            System.out.println("PW is not valid");
        };
    }

    public static boolean isValidPassword(String str) {
        if(str.length()  < 10) return false;

        int charCounter = 0;
        int numCounter = 0;

        for(int i = 0; i < str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if(ch >= 'A' && ch <= 'Z') {
                charCounter++;
            }

            if(ch >= '0' && ch <= '9') {
                numCounter++;
            }
        }

        return (charCounter >= 2 && numCounter >= 2);
    }
}
