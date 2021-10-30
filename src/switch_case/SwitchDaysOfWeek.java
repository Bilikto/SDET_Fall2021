package switch_case;

import java.util.Scanner;

public class SwitchDaysOfWeek {
    public static void main(String[] args) {

        String dayOfTheWeek = "Wednesday";

        switch(dayOfTheWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
        }


    }
}
