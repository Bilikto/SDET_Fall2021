package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAnArrayList {

    public static void main(String[] args) {

        List<String> citiesList = Arrays.asList("Chicago", "Los Angeles", "San Francisco", "San Diego", "Buffalo", "Denver");

        System.out.println("Before sorting --> " + citiesList);

        // sort() method is a static method in Collections class
        // and only works with collections that are in Collections framework
        // it sorts the elements of a collection in ascending order
        Collections.sort(citiesList);

        System.out.println("After sorting --> " + citiesList);



        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 67, 34, 23, 65, 48, 99, 12));

        System.out.println("Before sorting " + numbers);

        Collections.sort(numbers);

        System.out.println("After sorting " + numbers);

        //max()
        int maxNums = Collections.max(numbers);
        System.out.println(maxNums);

        //min()
        int minNums = Collections.min(numbers);
        System.out.println(minNums);


        //find max number in array
        int[] arr = {3, 4, 45, 3, 5, - 75, -199, 198, 103, 68, 54};

        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]); //199

        //another way
//        int max = 0;
//        for(int i : arr) {
//            if(i > max) {
//                max = i;
//            }
//        }
//
//        System.out.println("The max in arrays is: " + max);

        Arrays.sort(arr);
        System.out.println("The 3 biggest elements: " +arr[arr.length-1] + ", " + arr[arr.length-2] + ", " + arr[arr.length-3]);





    }
}
