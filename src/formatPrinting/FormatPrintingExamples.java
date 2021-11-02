package formatPrinting;

import java.util.Calendar;

public class FormatPrintingExamples {

    public static void main(String[] args) {

        // Formatting Numeric Print Output - is a way we can control the format of our output print
        // especially useful to print out Calendar date and time, double and floating number so that
        // we can format the number of digits that can be printed after the decimal point

        // Format specifiers are special characters that start with a percent sign [%] and followed by a
        // letter are used to specify the output format and the data type
        // of the varargs. Varargs are the arguments that we pass as a variable to be printed

        // %d -> integer
        // %s -> string
        // %f -> float and double
        // %n -> new line

        int numberOfMonth = 12;
        System.out.format("Number of month in a year is %d%n", numberOfMonth); //numberOfMonth is a number
        System.out.println("Number of month in a year is " + numberOfMonth); //numberOfMonth is a string

        String schoolName = "DevX";
        System.out.format("The name of the school is %s%n", schoolName);

        double PI = 3.14159265359;
        System.out.format("The value of PI is %.3f%n", PI);
        System.out.printf("The value of PI is %.3f\n", PI);

        //Date formatting
        Calendar cal = Calendar.getInstance();
        System.out.printf("%tb %td, %tY", cal, cal, cal); //Now 01, 2021

    }

}
