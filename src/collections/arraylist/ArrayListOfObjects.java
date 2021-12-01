package collections.arraylist;

import java.util.ArrayList;

public class ArrayListOfObjects {

    //ArrayList is a collection of objects and it implements  List interface
    // and it is part of Collection interface. (Collection Framework).
    // ArrayList is dynamic where we can create and manipulate it by adding or removing elements
    // from it, the size can change.

    // ArrayList stores objects, primitives by autoboxing them to their corresponding wrapper classes

    //ArrayList elements can be accessed by their index positions.

    public static void main(String[] args) {

        ArrayList list = new ArrayList();// list of objects or collections of objects

        list.add(123);
        list.add("123");
        list.add('k');
        list.add(true);


        System.out.println(list);

        int a = (int) list.get(0);

    }
}
