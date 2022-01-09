package algorithm_class_Igor_Strashko;

import java.util.Arrays;

public class TwoNumbersSum {

    public static void main(String[] args) {
        int[] nums = {3, 5, -4, 8, 11, 1, -1, 6};
        System.out.println(Arrays.toString(getTwoNumberSum(nums, 10)));
    }

    public static int[] getTwoNumberSum(int[] arr, int target) {
        for(int i = 0; i < arr.length; i = i + 2) {
            for(int j = i+1; j < arr.length; j++) {
                int sum = arr[j] + arr[i];
                if(sum == target) {
                    return new int[] {arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }
}
