package HomeWorks;

import java.util.Scanner;

public class Operators3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("#1");
        areaAndPerimeterOfRectangle();

        System.out.println("================================");
        System.out.println("#2");
        areaAndPerimeterOfCircle();

        System.out.println("================================");
        System.out.println("#3");
        System.out.println("The sum of the digits is " + sumOfDigitsOfInt());
    }

    public static  void areaAndPerimeterOfRectangle() {
        System.out.println("Enter a value of width:");
        double width = scanner.nextDouble();
        System.out.println("Enter a value of height:");
        double height = scanner.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + String.format("%.2f", area));
        System.out.println("Perimeter is 2 * (" + width + " + " + height+ ") = " + String.format("%.2f", perimeter));
    }

    public static  void areaAndPerimeterOfCircle() {
        System.out.println("Enter a value of radius:");
        double radius1 = scanner.nextDouble();
        int num = 2;
        double PI = Math.PI; //3.14

        //Perimeter=2*radius*3.14;
        double perimeter1 = num * radius1 * PI;
        System.out.println("Perimeter is: " + String.format("%.2f", perimeter1));

        //Area=3.14*radius*radius;
        double area1 = PI*radius1*radius1;
        System.out.println("Area is " + String.format("%.2f", area1));
    }

    public static int sumOfDigitsOfInt() {
        System.out.println("Enter an integer number:");
        int num1 = scanner.nextInt();
        int firstNum, lastNum;

        if (num1 <= 0) {
            return 0;
        } else {
            firstNum = num1 % 10;
            lastNum = num1 / 10;
            return firstNum + lastNum;
        }
    }


}
