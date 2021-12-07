package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopingOverSetElements {
    public static void main(String[] args) {

        /*
        * Since Set collection is not index based and there is not order of elements
        * we cannot loop over this collection using indices [index positions]
        *
        * However, 2 way of iterating over set collection is by using enhanced "for" loop [aka for each]
        * or by using Iterator interface.
        *
        * "Iterator" is an interface used for iterating over collections such as: Set etc.
        * "boolean hasNext()" --> Returns true if the iteration has more elements.
        * "E next()" --> Returns the next element in the iteration.
        *
        * iterator<E> iterator() -> Returns an iterator over the elements in this set. The elements are
        * returned in no particular order (unless this set is an instance of some
        * class that provides a guarantee).
        *
        * */

        Set<Character> symbols = new HashSet<>(Arrays.asList('#', '&', '%', '$', '?'));
        System.out.println(symbols);

        //for loop
        for(char ch : symbols) {
            System.out.print(ch + " ");
        }

        System.out.println();

        //iterator() method
        Iterator<Character> setIterator = symbols.iterator();

        while(setIterator.hasNext()) {
            System.out.print(setIterator.next() + " ");
        }

        System.out.println();
        System.out.println("======================================================");

        char $symbol = ' ';
        Iterator<Character> setIterator1 = symbols.iterator();

        while(setIterator1.hasNext()) {
            char temp = setIterator1.next();
            if(temp == '$') {
                $symbol = temp;
            }
        }

        System.out.println("$ sign was assigned to $symbol var: " + $symbol);

    }
}
