package collections.set;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {
        /*
        * Set is an interface that extends Collection interface (used to store unique elements and unordered)
        * Set has 3 implementations: HashSet, LinkedHashSet, TreeSet
        * Collection that stores only unique elements without duplicates
        * Elements are unordered and not index based
        *
        * Set doesn`t have an index, so it doesn`t have a get() method.
        * */

        //HashSet is the widely used Set type which does not have any orders
        Set<String> carMakers = new HashSet<>();

        boolean isAdded = carMakers.add("Honda"); //true
        boolean hasAdded = carMakers.add("Honda"); //false

        System.out.println("Was Honda added already? " + isAdded);
        System.out.println("Was Honda added already? " + hasAdded);
        System.out.println(carMakers); //[Honda]

        //add() --> returns boolean
        carMakers.add("Ford");
        carMakers.add("Cadillac");
        carMakers.add("Chevrollet");
        System.out.println(carMakers); //[Chevrollet, Ford, Honda, Cadillac]



    }
}
