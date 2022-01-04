package java_recap;

public class SwitchStatement {

    //Enum in Switch Statement
    public enum Days {Sun, Mon, Tue, Wed, Thu, Fri, Sat};

    public static void main(String[] args) {

        Days[] DayNow = Days.values();

        for (Days now : DayNow) {
            switch(now) {
                case Sun:
                    System.out.println("Sunday");
                    break;
                case Mon:
                    System.out.println("Monday");
                    break;
                case Tue:
                    System.out.println("Tuesday");
                    break;
                case Wed:
                    System.out.println("Wednesday");
                    break;
                case Thu:
                    System.out.println("Thursday");
                    break;
                case Fri:
                    System.out.println("Friday");
                    break;
                case Sat:
                    System.out.println("Saturday");
                    break;
            }
        }
    }
}
