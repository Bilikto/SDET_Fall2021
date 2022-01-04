package oop_class_Chirag.exceptions.throw_statement;

public class ThrowExample {
    public static void main(String[] args) {
        int dayNumber = 12;

        switch(dayNumber) {
            case 0:
                System.out.println("Sun");
                break;
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                throw new RuntimeException("Please, enter valid number");
        }

        System.out.println("We`re using entered number");
    }
}
