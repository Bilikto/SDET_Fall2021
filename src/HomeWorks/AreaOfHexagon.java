package HomeWorks;

public class AreaOfHexagon {
    public static void main(String[] args) {

        /*
        * Write a Java program to compute the area of a hexagon.
        * Area of a hexagon = (6 * s^2)/(4*tan(π/6))
        * tan = Math.tan | π = Math.PI
        * Where S is the length of a side
        * Example:
        * Input the length of a side of the hexagon: 6
        * Expected Output
        * The area of the hexagon is: 93.53074360871938
        */

        int lengthOfSide = 6;
//        double areaOfHexagon = lengthOfSide * Math.pow(lengthOfSide, 2)/(4 * Math.tan(Math.PI/lengthOfSide));
//        System.out.println("The area of the hexagon is " + areaOfHexagon);

        double areaOfHexagon = lengthOfSide * (lengthOfSide * lengthOfSide)/(4 * Math.tan(Math.PI/lengthOfSide));
        System.out.println("The area of the hexagon is " + areaOfHexagon);
    }
}
