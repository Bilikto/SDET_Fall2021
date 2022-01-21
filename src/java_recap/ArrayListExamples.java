package java_recap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> listOfFruit = new ArrayList<>();
        listOfFruit.add("Banana");
        listOfFruit.add("Mango");
        listOfFruit.add("Apple");
        listOfFruit.add("Grapes");


        Iterator<String> iterator = listOfFruit.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //How to sort ArrayList
        Collections.sort(listOfFruit);
        System.out.println(listOfFruit);

    }
}
