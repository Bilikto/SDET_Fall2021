package arrays;

import java.util.Arrays;

public class ArrayWithCharType {
    public static void main(String[] args) {

        //The default value of char is '\u0000' which comes from Unicode table

        char[] letters = new char[]{'a', 'b', 'c', 'd'};

        for(int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }

        char[] arr1 = new char[4];
        System.out.println(Arrays.toString(arr1)); //[ ,  ,  ,  ]

    }
}
