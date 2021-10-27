package if_else_statement_oca_ch2.nested_if_else_stmts;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        /*
            1. input from the user for the "numberOfSides" of the shape [EX: triangle and quadrilateral shape]
            2. now ask user to input the length for the each of the sides of the shape[EX: a,b,c,d]
            3. according to the "numberOfSides" we need to identify the "typeOfShape"
            4. and print out the "nameOfTheShape" + "typeOfShape" and "perimeter" of the shape

            * perimeter of any shape is just adding all the sides;

            Expected output: Isosceles Triangle and it's perimeter is 24.3 inches;

            Limitations:
            3 types of each shape:
                - Triangle:
                    -> Equilateral [all sides equal]
                    -> Isosceles [2 sides equal]
                    -> Scalene [no equal sides]
                - Quadrilateral shape [shape that has 4 sides]
                    -> Square [all sides equal]
                    -> Rectangle [2 parallel sides equal]
                    -> Trapezoid [no equal sides or 2 sides can be equal]
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter any number for the shape..");
        byte numOfSides = scanner.nextByte();
        double a, b, c, d;
        double lengthOfPerimeters = 0;
        String nameOfTheShape = "";
        String typeOfTheShape = "";

        switch (numOfSides) {
            case 3:
                nameOfTheShape = "Triangle shape";
                System.out.println("Please, input length of the A side");
                a = scanner.nextInt();
                System.out.println("Please, input length of the B side");
                b = scanner.nextInt();
                System.out.println("Please, input length of the C side");
                c = scanner.nextInt();
                lengthOfPerimeters = a + b + c;

                if (a == b && a == c) {
                    typeOfTheShape = "Equilateral";
                } else if (a == b || b == c) {
                    typeOfTheShape = "Isosceles";
                } else {
                    typeOfTheShape = "Scalene";
                }
                break;

            case 4:
                nameOfTheShape = "Quadrilateral shape";
                System.out.println("Please, input length of the A side");
                a = scanner.nextInt();
                System.out.println("Please, input length of the B side");
                b = scanner.nextInt();
                System.out.println("Please, input length of the C side");
                c = scanner.nextInt();
                System.out.println("Please, input length of the D side");
                d = scanner.nextInt();
                lengthOfPerimeters = a + b + c + d;

                if (a == b && b == c && c == d) {
                    typeOfTheShape = "Square";
                } else if ((a == b || c == d) || (b == c || a == d) || (b == d || c ==a)) {
                    typeOfTheShape = "Rectangle";*
                } else {
                    typeOfTheShape = "Trapezoid";
                }
                break;

        }

        System.out.println("The shape is " + typeOfTheShape + " with length of perimeters " + lengthOfPerimeters);

        //Refactor code using things that we have covered
    }
}
