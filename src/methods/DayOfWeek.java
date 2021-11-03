package methods;

import java.util.Scanner;

public class DayOfWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter numbers of week day..");
        int n = scanner.nextInt();

        switch (n) {
            case 0 -> printDay("Sunday");
            case 1 -> printDay("Monday");
            case 2 -> printDay("Tuesday");
            case 3 -> printDay("Wednesday");
            case 4 -> printDay("Thursday");
            case 5 -> printDay("Friday");
            case 6 -> printDay("Saturday");
        }

    }

    public static void printDay(String str) {

        if (str.equals("Saturday") || str.equals("Sunday")) {
            System.out.println(str + "-> Weekend");
        } else {
            System.out.println(str);
        }

    }


}
