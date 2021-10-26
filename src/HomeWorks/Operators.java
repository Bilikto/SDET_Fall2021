package HomeWorks;

public class Operators {
    public static void main(String[] args) {

        System.out.println("Task #1");
        int num1 = 25;
        int num2 = 5;
        System.out.println("Sum of two integers: " + (num1 + num2));
        System.out.println("Difference of two integers: " + (num1 - num2));
        System.out.println("Product of two integers: " + num1 * num2);

        System.out.println();
        System.out.println("Task #2");
        int a = 5, b = 8, c = 6;
        int d = 55, e = 9;
        int f = 20, g = 3;
        int h = 15, j = 2;
        System.out.println(-a + b * c);
        System.out.println((d + e) % e);
        System.out.println(f + -g * a / b);
        System.out.println(a + h / g * j - b % g);

        System.out.println();
        System.out.println("Task #3");
        int number1 = 8;
        for (int i = 1; i <=10; i++) {
            System.out.println(number1 + " x " + i + " = " + number1 * i);
        }

    }
}
