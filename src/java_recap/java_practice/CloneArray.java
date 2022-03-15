package java_recap.java_practice;

import java.util.Arrays;

public class CloneArray {

    public static void main(String[] args) {
        int[] arr = {33,3,4,5};
        int[] cloneArr = arr.clone();
        System.out.println(Arrays.toString(cloneArr));

    }
}
