package homeWorks;

import java.util.Arrays;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int[] num1 = {1, 3, 8, 6, 8, 10};
        int res = 0;

        for(int i = 0; i < num1.length; i++) {
            Arrays.sort(num1);
            res = num1[num1.length - 2];
        }
        System.out.println(res);
    }
}
