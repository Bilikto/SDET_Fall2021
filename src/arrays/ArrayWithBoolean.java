package arrays;

import java.util.Arrays;

public class ArrayWithBoolean {
    public static void main(String[] args) {

        //The default value of boolean element is false

        boolean[] boolArr = {1 < 2, true, false, true, false};
        System.out.println(Arrays.toString(boolArr));
        System.out.println(boolArr[0]);


        boolean[] boolArr1 = new boolean[2];
        boolArr1[0] = true;
        boolArr1[1] = isBigger(2, 4);

        System.out.println(Arrays.toString(boolArr1));

    }

    static boolean isBigger(int x, int y) {
        boolean isBigger = x > y;
        return isBigger;
    }
}
