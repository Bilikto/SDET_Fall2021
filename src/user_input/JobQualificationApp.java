package user_input;

import java.util.Scanner;

public class JobQualificationApp {
    public static void main(String[] args) {

        /*
        * 1. Wwe want to get full name -> String
        * 2. Age -> short
        * 3. Years of experience -> byte
        * 4. Eligible to work -> boolean
        * 5. Expected compensation -> double
        * */

        System.out.println("Hi! Welcome to ZIP recruiter. Please fill in the required fields: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name:");
        String fullName = scanner.nextLine();

        System.out.println("Please enter your age:");
        short age = scanner.nextShort();

        System.out.println("Please enter the number years you have been in IT:");
        byte yearsOfExperience = scanner.nextByte();

        System.out.println("Are you eligible to work? [Enter 'Y' for yes or 'N' for no]");
        char workEligibility = scanner.next().charAt(0);
        boolean isEligible = workEligibility == 'y' || workEligibility == 'Y';

        System.out.println("What is your expected annual compensation? ");
        double compensation = scanner.nextDouble();

        System.out.println("Candidate info: \n" +
                "Full name: " + fullName + "\n" +
                "Age: " + age + "\n" +
                "Experience: " + yearsOfExperience + "\n" +
                "Eligibility to work: " + (isEligible ? "Yes" : "No") + "\n" +
                "Expected annual compensation: " + compensation);


        // 1. If the candidate is eligible to work
        // 2. Expected salary in the range of 100_000 to 140_000
        // 3. Number of years of experience is greater than or equal to 5
        // 4. Age older than or equal to 21
        // Task is to qualify a candidate for a position if they meet all the above requirements
        // Expected output: The candidate is qualified.
        // If they don`t meet the requirements then "The candidate is not qualified".

        boolean isQualified = isEligible
                && compensation <= 140_000
                && yearsOfExperience >= 5
                && age >= 21;

        System.out.println(isQualified ? "The candidate is qualified" : "The candidate is not qualified");












    }
}
