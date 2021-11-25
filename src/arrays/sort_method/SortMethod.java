package arrays.sort_method;

import java.util.Arrays;

public class SortMethod {

    // sort() is void method which sorts an array in ascending order

    public static void main(String[] args) {

        int[] scores = {75, 78, 98, 95, 84, 57, 65};

        System.out.println("Before sorting: " + Arrays.toString(scores));
        Arrays.sort(scores);
        System.out.println("After sorting: " + Arrays.toString(scores));

        //Capitalized goes first, then lower case letters
        //numbers goes first before letters
        String[] schools = {"harvard", "Stanford", "462", "OSU", "anu", "ASU", "Penn State", "132", "UCLA", "Berkeley", "UNL"};
        System.out.println("Before sorting: " + Arrays.toString(schools));
        Arrays.sort(schools);
        System.out.println("After sorting: " + Arrays.toString(schools));

        String[] names = {"Aaron", "Akon", "Arthur", "Adeline", "Abe", "Aabraham"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        //sorts using ASCII table
        char[] specialChars = {'%', '.', '7', '!', '^', '*', ' ' };
        System.out.println("Before sorting: " + Arrays.toString(specialChars));
        Arrays.sort(specialChars);
        System.out.println("After sorting: " + Arrays.toString(specialChars));

    }
}
