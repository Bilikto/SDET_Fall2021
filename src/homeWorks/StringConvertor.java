package homeWorks;

import java.util.Scanner;

public class StringConvertor {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Please, enter text...");
        String str = scanner.nextLine();

        System.out.println("lowercase: " + getConvertedToLowerString(str));
        System.out.println("uppercase: " + getConvertedToUpperString(str));
    }

    public static String getConvertedToUpperString(String str) {
        //return str.toUpperCase();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= str.length() - 1; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString().toUpperCase();
    }

    public static String getConvertedToLowerString(String str) {
        //return str.toLowerCase();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= str.length() - 1; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString().toLowerCase();
    }
}


