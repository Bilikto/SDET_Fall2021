package practice_with_Fenton;

import java.util.Arrays;

public class BinarySearchMethod {

    public static void main(String[] args) {

        //int
//        int[] nums = {8, 1, 6, 9, 11, 18};
//        //System.out.println(nums);
//        System.out.println(Arrays.toString(nums));
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
//        int index = Arrays.binarySearch(nums, 6);
//        System.out.println(index);

        //string
        String[] strArr = {"Alex", "John", "Bob", "25", "helen", "101"};
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.binarySearch(strArr, "101"));
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.binarySearch(strArr, "101"));

    }


}
