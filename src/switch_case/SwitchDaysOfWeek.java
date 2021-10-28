package switch_case;

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
            case "Sanday":
                System.out.println("Weekend");
                break;
        }



    }
}
