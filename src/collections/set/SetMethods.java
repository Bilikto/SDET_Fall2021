package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        /*
        * add(element) --> This method is used to add a specific element to the set.
        *                  The function adds the element only if the specified element is not already present in the set else the function returns False if the element is already
        *                  present in the Set.
        * addAll(Collection) --> This method is used to append all of the elements from the mentioned collection to the existing set.
        *                        The elements are added randomly without following any specific order.
        * boolean remove(E e) --> return true if the element exists and removed and false otherwise
        * boolean contains(E e) --> returns true if the element exists in the collection and false otherwise
        * boolean isEmpty() --> returns true if there is no elements in the collection
        * int size() --> return of elements from given collection
        * void clear() --> removes all elements of a set collection
        * iterator() --> This method is used to return the iterator of the set. The elements from the set are returned in a random order.
        * remove() --> This method is used to remove the given element from the set. Return boolean.
        * removeAll(collection)	--> This method is used to remove all the elements from the collection which are present in the set.
        *                           This method returns true if this set changed as a result of the call.
        * toArray() -->	This method is used to form an array of the same elements as that of the Set.
        *
        * */

        Set<String> ssn = new HashSet<>(
                Arrays.asList(
                        "010 - 00 - 9956",
                        "011 - 01 - 0110",
                        "012 - 02 - 1212",
                        "020 - 20 - 3232"
                )
        );

        System.out.println("Before removing " + ssn);

        String mySSn = "011 - 01 - 0110";

        System.out.println("Does SSN exist in the collection? " + ssn.contains(mySSn));

        boolean isRemoved = ssn.remove(mySSn);
        System.out.println("Has my ssn been removed from the collection? " + isRemoved);

        System.out.println("After changing: " + ssn);
        System.out.println("Is the set is empty before removing elements? " + ssn.isEmpty());

        ssn.clear();
        System.out.println("After removing all elements of set" + ssn);

        System.out.println("Is the set is empty after removing elements? " + ssn.isEmpty());





    }
}
