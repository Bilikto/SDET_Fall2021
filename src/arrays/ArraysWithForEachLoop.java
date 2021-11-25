package arrays;

import java.util.Arrays;

public class ArraysWithForEachLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 5;
        numbers[4] = 7;

//        System.out.println(numbersays.toString(numbers)); //[5, 5, 4, 5, 7]

        for(int i: numbers) {
            System.out.println(Arrays.toString(numbers)); // [5, 5, 4, 5, 7] --> 5 times
//            System.out.println(numbers[i-1]); // 7 7 5 7 and 6 is outOfBoundException
//            System.out.println(numbers[0]); //5 --> 5 times
//            System.out.println("any"); //any --> 5 times
        }

        int sum = 0;
        for(int currentNumber : numbers) {
            sum = sum + currentNumber;
        }
        System.out.println("The sum of numbers in " + Arrays.toString(numbers) + " is " + sum);

        //odd numbers
        for(int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        
        
    }
}
