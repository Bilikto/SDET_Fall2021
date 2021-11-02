package interview_questions_Baha.solutions;

import java.util.Scanner;

public class CollegeClassSuggestionForMajors {
    public static void main(String[] args) {
        /*
        * Tell students which classes they have to take.
        * What major are you in?
        * - accounting -> year 1 and 2 should take Math 1 and Math 2, Calculus;
        * -> year 3 and 4 -> Excel, Macro and Micro economics;
        * - Software eng -> year 1 and 2 should take Math 1 and Math 2, Calculus;
        * -> year 3 and 4 -> Java, Database, Cybersecurity;
        * - psychology -> year 1 and 2 should take Public speaking, Body languages;
        * -> year 3 and 4 -> Psychology, Neuroscience;
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Major...");
        String major = scanner.nextLine().toLowerCase();

        System.out.println("Enter year in which the student is in...");
        int year = scanner.nextInt();

        String course = major.equals("psychology") ? "Public speaking, Body languages" : "Math 1 and Math 2, Calculus";

        switch(major) {
            case "accounting" :
                if (year == 1 || year == 2) {
                    System.out.println(course);
                } else if (year == 3 || year == 4) {
                    System.out.println("Excel, Macro and Micro economics");
                } else {
                System.out.println("Invalid value in accounting");
                }
                break;
            case "software engineering":
                if (year == 1 || year == 2) {
                    System.out.println(course);
                } else if (year == 3 || year == 4) {
                    System.out.println("Java, Database, Cyber security");
                } else {
                    System.out.println("Invalid value in Software engineering");
                }
                break;
            case "psychology":
                if (year == 1 || year == 2) {
                    System.out.println(course);
                } else if (year == 3 || year == 4) {
                    System.out.println("Psychology, Neuroscience");
                } else {
                    System.out.println("Invalid value in Psychology");
                }
                break;
            default:
                System.out.println("Enter a course from the following: accounting, software engineering, psychology");
        }


    }
}
