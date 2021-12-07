package collections.arraylist;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NestedArrayList1 {
    public static void main(String[] args) {

        //ArrayList can store other collections as elements

        ArrayList<String> school1 = new ArrayList<>((Arrays.asList("Stanford", "Harvard", "OSU")));
        ArrayList<String> school2 = new ArrayList<>((Arrays.asList("MIT", "NWU", "UI", "Berkeley")));

        //nested ArrayList
        ArrayList<ArrayList<String>> schoolList = new ArrayList<>();
        schoolList.add((school1));
        schoolList.add((school2));

        System.out.println("School 1: " + school1);
        System.out.println("School 2: " + school2);
        System.out.println("School list: " + schoolList);
        System.out.println("Nested school list: " + schoolList.get(0));
        System.out.println("Nested school list: " + schoolList.get(1));

        for(int i = 0; i < schoolList.size(); i++) {
            for(int j =0; j < schoolList.get(i).size(); j++) {
                schoolList.get(i).set(j, ("$" + schoolList.get(i).get(j)));
            }
        }

        System.out.println(schoolList);


    }

}
