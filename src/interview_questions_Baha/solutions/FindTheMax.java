package interview_questions_Baha.solutions;

import java.util.Scanner;

public class FindTheMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please entre for A number..");
        int a = scanner.nextInt();
        System.out.println("Please entre for B number..");
        int b = scanner.nextInt();
        System.out.println("Please entre for C number..");
        int c = scanner.nextInt();

        int maxNum = 0;

        if (a > b && a > c) {
            maxNum = a;
        } else if (b > a && b > c) {
            maxNum = b;
        } else if (c > a && c > b) {
            maxNum = c;
        } else if (a == b && a > c) {
            maxNum = a;
        } else if (c == b && c > a) {
            maxNum = b;
        } else if (a == c && a > b) {
            maxNum = c;
        } else {
                System.out.println("They are equal!");
            }

        if (maxNum > 0) {
            System.out.println("Tne max integer is : " + maxNum);
        }

    }
}
