package arrays;

import java.util.Arrays;

public class ArrayWithLongType {
    public static void main(String[] args) {

        //The default value of long elements is 0

        long[] longArr = {123, 467L, 892, 0L}; //[123, 467, 892, 0]

        System.out.println(Arrays.toString(longArr));
        System.out.println(longArr[0]);
        System.out.println(longArr[1]);
        System.out.println(longArr[2]);
        System.out.println(longArr[3]);

        System.out.println();

        for(int i = 0; i < longArr.length; i++) {
            System.out.println(longArr[i]);
        }


    }
}
