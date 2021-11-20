package homeWorks;

import java.util.Scanner;

public class CheckStringIsPalindrome {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "madam";

        System.out.print("String 1 ");
        if (isPalindrome(str1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println();

        System.out.print("String 2 ");
        if (isPalindrome(str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;

        while(i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


}
