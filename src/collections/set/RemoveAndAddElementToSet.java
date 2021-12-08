package collections.set;

import java.util.*;

public class RemoveAndAddElementToSet {

    public static void main(String[] args) {

        ArrayList<String> listOfCities = new ArrayList<>(Arrays.asList("Chicago", "LA", "SF", "NY", "Boston", "Dallas"));
        System.out.println("Cities in ArrayList: " + listOfCities);

        // LinkedHashSet implementation of set Interface
        // stores the elements in insertion order
        Set<String> LinkedSetOfCities = new LinkedHashSet<>(listOfCities); //same order as were inserted
        System.out.println("Cities in LinkedHashSet: " + LinkedSetOfCities);

        // HashSet implementation of set Interface
        // elements without any order
        Set<String> HashSetOfCities = new HashSet<>(listOfCities); //same order as were inserted
        System.out.println("Cities in HashSet: " + HashSetOfCities);

        // TreeSet implementation of set Interface
        // elements in natural order
        Set<String> treeSetOfCities = new TreeSet<>(listOfCities);
        System.out.println("Cities in TreeSet: " + treeSetOfCities);


        List<Integer> numbers = List.of(10, 99, 67, 44, 55, 78);
        System.out.println("Given numbers unordered: " + numbers);
        Set<Integer> setNumbers = new TreeSet<>(numbers);
        System.out.println("Numbers in TreeSet: " + setNumbers);







    }
}
