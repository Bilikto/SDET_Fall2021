package arrays.sort_method;

import java.util.Arrays;

public class CopyOfMethod {

    // since Array are mutable, it is better to use Arrays.copyOf() method
    // to make a copy, that way when an element is updated
    // on one of them the other one will not get affected

    public static void main(String[] args) {

        int[] scores = {75, 78, 98, 95, 84, 57, 65};
        int[] scoresCopy = scores; //both references to the same object
        System.out.println("Before change: " + Arrays.toString(scores));
        System.out.println("Before change: " + Arrays.toString(scoresCopy));
        scores[1] = 9;
        System.out.println("After change: " + Arrays.toString(scores));
        System.out.println("After change: " + Arrays.toString(scoresCopy));
        scoresCopy[3] = 28;
        System.out.println("After change: " + Arrays.toString(scores));
        System.out.println("After change: " + Arrays.toString(scoresCopy));

        System.out.println("==============================================");

        //copyOf() --> changes on copy doesn`t affect on original!
        int[] temps = {65, 73, 48, 92};
        int[] tempsCopy = new int[temps.length]; //both references to the different objects
        System.out.println("Before copy: " + Arrays.toString(tempsCopy)); //Before copy: [0, 0, 0, 0]
        tempsCopy = Arrays.copyOf(temps, temps.length);
        System.out.println("After copy: " + Arrays.toString(tempsCopy)); //After copy: [65, 73, 48, 92]

        temps[3] = 23;
        System.out.println("After changing temp: " + Arrays.toString(temps)); //After copy: [65, 73, 48, 23]
        System.out.println("After changing temp: " + Arrays.toString(tempsCopy)); //After copy: [65, 73, 48, 92]

        tempsCopy[2] = 104;
        System.out.println("After changing tempsCopy: " + Arrays.toString(temps)); //After copy: [65, 73, 48, 23]
        System.out.println("After changing tempsCopy: " + Arrays.toString(tempsCopy)); //After copy: [65, 73, 104, 92]

        System.out.println("==============================================");

        //Copy using Loop
        int[] numbers1 =  {8, 4, 3, 9, 7};
        int[] numbers2 = new int[numbers1.length];

        for(int i = 0; i < numbers1.length; i++) {
            numbers2[i] = numbers1[i];
        }

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        //using for loop for copy is a safe way!
        numbers1[0] = 10;
        numbers1[3] = 130;
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        numbers2[0] = 106;
        numbers2[3] = 145;
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));



    }
}
