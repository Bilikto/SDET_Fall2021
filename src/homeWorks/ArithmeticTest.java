package homeWorks;

public class ArithmeticTest {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum = number1 + number2;
        int diff = number1 - number2;
        int product = number1 * number2;
        int division = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The sum, difference, product, division\nand remainder of 98 and 5 are:\n" +
                "\tSum: " + sum + "\n" +
                "\tDifference: " + diff + "\n" +
                "\tProduct: " + product + "\n" +
                "\tDivision: " + division + "\n" +
                "\tRemainder: " + remainder);
    }
}
