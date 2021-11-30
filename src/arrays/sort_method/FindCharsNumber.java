package arrays.sort_method;

import java.sql.Array;
import java.util.Arrays;

public class FindCharsNumber {
    public static void main(String[] args) {

        String[] cities = {"Los Angeles", "San Francisco", "Chicago", "New York", "Boston", "London"};
        System.out.println(Arrays.toString(getLength(cities)));

    }

    public static int[] getLength(String[] arr) {
        int[] newArr = new int[arr.length];

        for(int i = 0; i < newArr.length; i++) {
            int count = 0;
            for(int j=0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'l' || arr[i].charAt(j) == 'L') {
                    count++;
                }
            }
            newArr[i] = count;
        }
        return newArr;
    }

}
