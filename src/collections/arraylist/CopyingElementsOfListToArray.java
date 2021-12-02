package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CopyingElementsOfListToArray {

    public static void main(String[] args) {

        // another way of inserting elements at initialization of an arrayList
        ArrayList<Integer> idsList = new ArrayList<>(Arrays.asList(1221, 2132, 3432, 2423, 24335, 3444));
        System.out.println("Initial idsList: " + idsList);

        ArrayList<Integer> idsListCopy = new ArrayList<>(idsList);
        System.out.println("Initial idsListCopy: " + idsListCopy);

        //ArrayList to Array by looping
        int[] idsArray = new int[idsListCopy.size()];
        for(int i = 0; i < idsList.size(); i++) {
            idsArray[i] = idsListCopy.get(i);
        }

        System.out.println("Array: " + Arrays.toString(idsArray));


    }
}
