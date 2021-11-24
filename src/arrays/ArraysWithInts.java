package arrays;

import java.util.Arrays;

public class ArraysWithInts {
    public static void main(String[] args) {
        //the default values of int elements is 0

        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 9;

        System.out.println(Arrays.toString(numbers)); //[5, 7, 9, 0, 0]

        int sum = numbers[0] + numbers[2];
        System.out.println(sum);//14

        numbers[2] = sum;
        System.out.println(numbers[2]);//14







    }
}
