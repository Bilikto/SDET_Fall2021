package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {

        //the default values of string elements is null

        String[] names = new String[5]; // --> size of array

        names[0] = "Aisha";
        names[1] = "Alex";
        names[2] = "Daniel";
        names[3] = "Sam";
        names[4] = "Elena";

        //ways to print array
        System.out.println(Arrays.toString(names)); // [Aisha, Alex, Daniel, Sam, Elena]

        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        String[] school = new String[]{"Stanford", "Harvard", "OSU", "Penn State"};
        System.out.println(school[2]);
        String[] school2 = {"Devx", "UxUiSchool", "DevxSchool"};
        System.out.println(school2[2]);
        System.out.println(school2[school2.length-1]);



    }
}
