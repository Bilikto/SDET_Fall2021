package methods.double_return_type;

import java.util.Scanner;

public class DoubleReturnType {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your annual salary...");
        double salary = scanner.nextInt();
        System.out.println("Are you married...");
        boolean isMarried = scanner.nextBoolean();

        DoubleReturnType myObj = new DoubleReturnType();
        System.out.println("The amount you should pay is " + myObj.calculateTax(salary, isMarried));

    }

    public double calculateTax(double salary, boolean isMarried) {
        return isMarried ? salary * 5 / 100 : salary * 30 / 100;
    }

}
